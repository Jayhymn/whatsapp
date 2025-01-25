package com.wakeupdev.whatsapp.chats.data

data class Thread(
    val id: Int,
    val contactName: String,
    val isSent: Boolean,
    val lastChat: String,
    val dateTime: String,
    val profileImageUrl: String,
    val unreadCount: Int
)