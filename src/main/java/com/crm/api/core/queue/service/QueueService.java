package com.crm.api.core.queue.service;

public interface QueueService{

    void saveWechatMessage(String messageString);

    void saveWechatMessages(String messagesString);

    void saveChatroomMessage(String messageString);

    void saveChatroomMessages(String messagesString);
}
