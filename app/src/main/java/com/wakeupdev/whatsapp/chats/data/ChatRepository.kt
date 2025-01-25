package com.wakeupdev.whatsapp.chats.data

interface ChatRepository {
    fun getChat(recipient: String): List<Message>
    fun saveChat(chat: Message)
    fun deleteChat(chat: Message)
}

class ChatRepositoryImpl : ChatRepository {
    override fun getChat(recipient: String): List<Message> {
        TODO("Not yet implemented")
    }

    override fun saveChat(chat: Message) {
        TODO("Not yet implemented")
    }

    override fun deleteChat(chat: Message) {
        TODO("Not yet implemented")
    }

}