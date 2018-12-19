package com.faisco.active_mq.service;

public interface ActiveMqService {
    void sendMsg(String message);

    void receiveMsg(String message);
}
