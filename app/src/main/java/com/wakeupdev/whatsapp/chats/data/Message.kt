package com.wakeupdev.whatsapp.chats.data

data class Message(
    val id: Int,
    val contactName: String,
    val isSent: Boolean,
    val message: String,
    val dateTime: String
)