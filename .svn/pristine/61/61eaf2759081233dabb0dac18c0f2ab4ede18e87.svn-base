package com.infore.csep.receiver.netty;

import com.infore.csep.common.netty.CsepChannelRepository;
import com.infore.csep.common.netty.dto.CsepPack;
import com.infore.csep.receiver.service.IDownChannelService;
import com.infore.csep.receiver.service.IUpChannelService;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * This file is part of tsp Project
 * Created by bzzz (bzzz@space-walker.cn) on 2017/8/31 4:15
 * Copyright (c) 2017 www.space-walker.cn
 */
@Slf4j
@Data
@AllArgsConstructor
public class NettyServerHandler extends SimpleChannelInboundHandler<CsepPack> {

    private IUpChannelService upChannelService;

    private IDownChannelService downChannelService;

    private CsepChannelRepository channelRepository;

    /*
        * 收到消息时，返回信息
        */
    protected void channelRead0(ChannelHandlerContext ctx, CsepPack msg)
            throws Exception {
        Channel channel = ctx.channel();
        String clientId = msg.getClientId();
        Attribute<String> attr = channel.attr(channelRepository.CLIENT_INFO);
        attr.set(clientId);
        channelRepository.put(clientId, channel);

        upChannelService.handler(msg);

//        channel.writeAndFlush(CsepPack.buildPack(msg.getCommond(), msg.getFromNum(), clientId, "OK".getBytes()));

//        downChannelService.sendPack(msg.getCommond(), msg.getFromNum(), clientId, "OK".getBytes());
    }

//    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        log.info("连接的客户端地址:" + ctx.channel().remoteAddress());
//        ctx.writeAndFlush("客户端" + InetAddress.getLocalHost().getHostName() + "成功与服务端建立连接！ \n");
//    }

    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        channelRepository.remove(ctx);
        ctx.close();
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error(cause.getMessage(), cause);
        channelRepository.remove(ctx);
        ctx.close();
    }

}
