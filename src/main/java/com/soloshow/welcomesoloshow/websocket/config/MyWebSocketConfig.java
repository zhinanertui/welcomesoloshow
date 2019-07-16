package com.soloshow.welcomesoloshow.websocket.config;
//
//import com.soloshow.welcomesoloshow.websocket.constants.Const;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
///**
// * @author Xing ShiWei
// * @version 1.0
// * @since 2019-06-03 11:17
// **/
//public class MyWebSocketConfig implements WebSocketMessageBrokerConfigurer {
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
//        //注册一个Stomp的节点（endpoint）,并指定使用SockJS协议。
//        stompEndpointRegistry.addEndpoint(Const.WEBSOCKETPATH).withSockJS();
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        //服务端发送消息给客户端的域,多个用逗号隔开
//        registry.enableSimpleBroker(Const.WEBSOCKETBROADCASTPATH, Const.P2PPUSHBASEPATH);
//        //定义一对一推送的时候前缀
//        registry.setUserDestinationPrefix(Const.P2PPUSHBASEPATH);
//        //定义websoket前缀
//        registry.setApplicationDestinationPrefixes(Const.WEBSOCKETPATHPERFIX);
//    }
//}
