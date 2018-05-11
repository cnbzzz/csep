package com.infore.csep.test.client;

import com.google.common.base.Preconditions;
import com.infore.csep.common.ByteUtils;
import com.infore.csep.common.CommonUtils;
import com.infore.csep.common.netty.dto.CsepPack;
import io.netty.channel.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;

import java.io.UnsupportedEncodingException;

/**
 * This file is part of tsp Project
 * Created by bzzz (bzzz@space-walker.cn) on 2017/8/31 4:17
 * Copyright (c) 2017 www.space-walker.cn
 */
@Slf4j
@Data
@AllArgsConstructor
public class NettyClientHandler extends SimpleChannelInboundHandler<CsepPack> {

    private NettyClient nettyClient;

    protected void channelRead0(ChannelHandlerContext ctx, CsepPack msg) throws Exception {
        log.info(this.getClass().getSimpleName() + " {}", msg);
    }

    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        CsepPack csepPack = new CsepPack();
        csepPack.setStart("ZL");
        csepPack.setCommond(0xC1);
        csepPack.setFromNum(99987);
        csepPack.setClientId("3344");
        String clientId = CommonUtils.genRandomCode(8);
        csepPack.setClientId(clientId);

        csepPack.setContent(genL2Pack(0x10));

        ctx.writeAndFlush(csepPack);
    }

    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
//        nettyClient.doConnect();
        super.channelInactive(ctx);
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }

    public static byte[] genL2Pack(int dataType) throws Exception {
        byte[] b = new byte[0];

        b = ArrayUtils.addAll(b, (byte) 0x02, (byte) 0xee);
        b = ArrayUtils.addAll(b, (byte) 0x01);
        b = ArrayUtils.addAll(b, ByteUtils.int2Byte(12));
        //设备厂站编码
        b = ArrayUtils.addAll(b, "ZL123456789A".getBytes());
        b = ArrayUtils.addAll(b, (byte) 0x00);

        switch (dataType) {
            case 0x20:
                b = ArrayUtils.addAll(b, (byte) 0x20);
                b = ArrayUtils.addAll(b, gen0x20Pack());
                break;

            case 0x22:
                b = ArrayUtils.addAll(b, (byte) 0x22);
                b = ArrayUtils.addAll(b, gen0x22Pack());
                break;

            case 0x23:
                b = ArrayUtils.addAll(b, (byte) 0x23);
                b = ArrayUtils.addAll(b, gen0x23Pack());
                break;

            case 0x24:
                b = ArrayUtils.addAll(b, (byte) 0x24);
                b = ArrayUtils.addAll(b, gen0x24Pack());
                break;

            case 0x30:
                b = ArrayUtils.addAll(b, (byte) 0x30);
                b = ArrayUtils.addAll(b, gen0x30Pack());
                break;

            case 0x10:
                b = ArrayUtils.addAll(b, (byte) 0x10);
                b = ArrayUtils.addAll(b, gen0x10Pack());

            default:
                new RuntimeException("dataType not found");
        }

        b = ArrayUtils.addAll(b, ByteUtils.int2Byte(47));
        b = ArrayUtils.addAll(b, (byte) 0x03);
        return b;
    }

    public static byte[] gen0x10Pack() throws Exception {

        byte[] b = getL3Head("Aac114", 114);

        //总运行时间
        b = ArrayUtils.addAll(b, ByteUtils.short2Byte((short) 99));

        //总用电量
        b = ArrayUtils.addAll(b, ByteUtils.int2Byte(1316));

        //总出水量
        b = ArrayUtils.addAll(b, ByteUtils.int2Byte(1720));

        //设置控制位
        String oddStr = "01111111";
        String evenStr = "10000000";

        for (int i = 0; i < 8; i++) {
            String hexStr = evenStr;
            if ((i & 1) != 0) {
                hexStr = oddStr;
            }
            b = ArrayUtils.addAll(b, ByteUtils.bit2Byte(hexStr));
        }


        //设置值
        for (int i = 0; i < (104- 75) + 1; i++) {
            b = ArrayUtils.addAll(b, ByteUtils.short2Byte((short) 152));
        }

        //预留
        for (int i = 0; i < 17 ; i ++) {
            b = ArrayUtils.addAll(b, (byte) 0x00);
        }

        //设备编码（这个协议比较特殊，只有8位,其他两个是12位
        b = ArrayUtils.addAll(b,"12345678".getBytes("UTF-8"));

        //计算
        b = ArrayUtils.addAll(b, (byte) 0x01);

        //结束
        b = ArrayUtils.addAll(b, (byte) 0x03);

        return b;
    }


    public static byte[] gen0x20Pack() throws Exception {
        byte[] b = getL3Head("asdf20", 152);

        String oddStr = "11111111";
        String evenStr = "00000000";

        for (int i = 0; i < 28; i++) {
            String hexStr = evenStr;
            if ((i & 1) != 0) {
                hexStr = oddStr;
            }
            b = ArrayUtils.addAll(b, ByteUtils.bit2Byte(hexStr));
        }

        for (int i = 0; i < 31; i++) {
            b = ArrayUtils.addAll(b, ByteUtils.short2Byte((short) 152));
        }

        for (int i = 0; i < 7; i++) {
            b = ArrayUtils.addAll(b, ByteUtils.int2Byte(263));
        }

        for (int i = 0; i < 6; i++) {
            b = ArrayUtils.addAll(b, ByteUtils.short2Byte((short) 152));
        }

        b = ArrayUtils.addAll(b, getL3Tail("poiuytrewq20"));

        return b;
    }

    public static byte[] gen0x22Pack() throws Exception {
        byte[] b = getL3Head("asdf22", 88);

        b = ArrayUtils.addAll(b, getL3Body(84));

        b = ArrayUtils.addAll(b, getL3Tail("poiuytrewq22"));

        return b;
    }

    public static byte[] gen0x23Pack() throws Exception {
        byte[] b = getL3Head("asdf23", 166);

        b = ArrayUtils.addAll(b, getL3Body(156));

        b = ArrayUtils.addAll(b, getL3Tail("poiuytrewq23"));

        return b;
    }

    public static byte[] gen0x24Pack() throws Exception {
        byte[] b = getL3Head("asdf24", 107);

        b = ArrayUtils.addAll(b, getL3Body(96));

        b = ArrayUtils.addAll(b, getL3Tail("poiuytrewq24"));

        return b;
    }

    public static byte[] gen0x30Pack() throws Exception {
        byte[] b = getL3Head("asdf30", 104);

        b = ArrayUtils.addAll(b, getL3Body(98));

        String oddStr = "11111111";
        String evenStr = "00000000";

        for (int i = 0; i < 129 - 98; i++) {
            String hexStr = evenStr;
            if ((i & 1) != 0) {
                hexStr = oddStr;
            }
            b = ArrayUtils.addAll(b, ByteUtils.bit2Byte(hexStr));
        }

        b = ArrayUtils.addAll(b, getL3Body(347));

        b = ArrayUtils.addAll(b, (byte) 0x01);
        b = ArrayUtils.addAll(b, (byte) 0x03);

        return b;
    }

    private static byte[] getL3Head(String factNum, int len) throws Exception {
        Preconditions.checkArgument(factNum != null && factNum.length() == 6, "factNum.length must be 6");
        byte[] b = new byte[0];
        b = ArrayUtils.addAll(b, (byte) 0x02);
        b = ArrayUtils.addAll(b, factNum.getBytes());
        b = ArrayUtils.addAll(b, ByteUtils.short2Byte((short)len));
        b = ArrayUtils.addAll(b, (byte) 0x02);
        return b;
    }

    private static byte[] getL3Body(int len) throws Exception {
        byte[] b = new byte[0];
        for (int i = 0; i < (len - 10) / 2; i++) {
            b = ArrayUtils.addAll(b, ByteUtils.short2Byte((short) 22));
        }
        return b;
    }

    private static byte[] getL3Tail(String clientId) throws Exception {
        Preconditions.checkArgument(clientId != null && clientId.length() == 12, "clientId.length must be 12");

        byte[] b = new byte[0];
        b = ArrayUtils.addAll(b, clientId.getBytes("UTF-8"));
        b = ArrayUtils.addAll(b, (byte) 0x01);
        b = ArrayUtils.addAll(b, (byte) 0x03);
        return b;
    }

}