package com.wakeupdev.whatsapp.chats.data

object dummy {
    val sampleThreads = listOf(
        Thread(
            id = 1,
            contactName = "John Doe",
            isSent = true,
            lastChat = "Hey, how are you?",
            dateTime = "10:45 AM",
            profileImageUrl = "",
            unreadCount = 2
        ),
        Thread(
            id = 2,
            contactName = "Jane Smith",
            isSent = false,
            lastChat = "Are we still meeting later?",
            dateTime = "9:30 AM",
            profileImageUrl = "",
            unreadCount = 0
        )
    )
}