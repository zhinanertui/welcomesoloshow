package com.soloshow.welcomesoloshow.websocket.constants;

/**
 * @author Xing ShiWei
 * @version 1.0
 * @since 2019-06-03 11:14
 **/
public interface Const {

    String WEBSOCKETPATHPERFIX = "/ws-push";
    String WEBSOCKETPATH = "/endpointWisely";
    //消息代理路径
    String WEBSOCKETBROADCASTPATH = "/topic";
    //前端发送给服务端请求地址
    String FORETOSERVERPATH = "/welcome";
    //服务端生产地址,客户端订阅此地址以接收服务端生产的消息
    String PRODUCERPATH = "/topic/getResponse";
    //点对点消息推送地址前缀
    String P2PPUSHBASEPATH = "/user";
    //点对点消息推送地址后缀,最后的地址为/user/用户识别码/msg
    String P2PPUSHPATH = "/msg";
}
