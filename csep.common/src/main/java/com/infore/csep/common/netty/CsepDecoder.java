package com.infore.csep.common.netty;

import com.google.common.base.Preconditions;
import com.infore.csep.common.ByteUtils;
import com.infore.csep.common.UnpackUtils;
import com.infore.csep.common.netty.dto.CsepPack;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/3/30 14:31
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Slf4j
public class CsepDecoder extends LengthFieldBasedFrameDecoder {

    /**
     * 起始符+命令码+流水号+终端ID号+数据长度+数据块+校验码+结束符
     */
    private static final int PACK_MIN_SIZE = 2 + 1 + 4 + 8 + 2 + 1 + 1 + 1;

    /**
     *
     * @param maxFrameLength   网络字节序，默认为大端字节序
     * @param lengthFieldOffset 消息中长度字段偏移的字节数
     * @param lengthFieldLength 数据帧的最大长度
     * @param lengthAdjustment 该字段加长度字段等于数据帧的长度
     * @param initialBytesToStrip 从数据帧中跳过的字节数
     * @param failFast 如果为true，则表示读取到长度域，TA的值的超过maxFrameLength，就抛出一个 TooLongFrameException
     */
    public CsepDecoder(int maxFrameLength, int lengthFieldOffset,
                       int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip,
                       boolean failFast) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
                lengthAdjustment, initialBytesToStrip, failFast);
    }

    @Override
    protected CsepPack decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        if(in == null){
            return null;
        }

        Preconditions.checkState(in.readableBytes() >= PACK_MIN_SIZE, "illegal csepPack. csepPack must > %s", PACK_MIN_SIZE);

        byte[] bytes = new byte[15];
        in.readBytes(bytes);

        short contentLength = in.readShort();

        int unreadLength = contentLength + 2;
        Preconditions.checkState(in.readableBytes() >= unreadLength, "illegal csepPack. content < %s", unreadLength);

        byte[] unread = new byte[unreadLength];
        in.readBytes(unread);

        bytes = ArrayUtils.addAll(bytes, ByteUtils.short2Byte(contentLength));
        bytes = ArrayUtils.addAll(bytes, unread);

        CsepPack csepPack = UnpackUtils.unPack(bytes, CsepPack.class);
        return csepPack;
    }
}
