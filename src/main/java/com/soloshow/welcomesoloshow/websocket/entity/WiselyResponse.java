package com.soloshow.welcomesoloshow.websocket.entity;

/**
 * @author Xing ShiWei
 * @version 1.0
 * @since 2019-06-03 11:15
 **/
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
