package com.wakeupdev.whatsapp.chats.data

object dummy {
    val sampleThreads = listOf(
        Thread(
            id = 1,
            senderTitle = "John Doe",
            recipient = "Me",
            lastChat = "Hey, how are you?",
            dateTime = "10:45 AM",
            profileImageUrl = "",
            unreadCount = 2
        ),
        Thread(
            id = 2,
            senderTitle = "Jane Smith",
            recipient = "Me",
            lastChat = "Are we still meeting later?",
            dateTime = "9:30 AM",
            profileImageUrl = "",
            unreadCount = 0
        )
    )
}