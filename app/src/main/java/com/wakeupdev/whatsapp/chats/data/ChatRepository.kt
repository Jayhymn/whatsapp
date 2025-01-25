package com.wakeupdev.whatsapp.chats.data

import com.wakeupdev.whatsapp.database.entities.MessageEntity

interface ChatRepository {
    fun getChat(recipient: String): List<MessageEntity>
    fun saveChat(chat: MessageEntity)
    fun deleteChat(chat: MessageEntity)
}

class ChatRepositoryImpl : ChatRepository {
    override fun getChat(recipient: String): List<MessageEntity> {
        TODO("Not yet implemented")
    }

    override fun saveChat(chat: MessageEntity) {
        TODO("Not yet implemented")
    }

    override fun deleteChat(chat: MessageEntity) {
        TODO("Not yet implemented")
    }

}