package com.wakeupdev.whatsapp.chats.data

data class Chat(
    val id: Int,
    val senderTitle: String,
    val recipient: String,
    val message: String,
    val dateTime: String
)