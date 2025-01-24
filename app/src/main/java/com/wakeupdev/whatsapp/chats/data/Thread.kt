package com.wakeupdev.whatsapp.chats.data

data class Thread(
    val id: Int,
    val senderTitle: String,
    val recipient: String,
    val lastChat: String,
    val dateTime: String,
    val profileImageUrl: String,
    val unreadCount: Int
)