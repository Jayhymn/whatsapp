package com.wakeupdev.whatsapp.chats.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.chats.data.Thread
import com.wakeupdev.whatsapp.chats.data.dummy
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun ChatsScreen(modifier: Modifier = Modifier, threads: List<Thread>) {
    Column {
        threads.forEach {
            ChatItem(
                chatTitle = it.contactName,
                lastChat = it.lastChat,
                dateTime = it.dateTime,
                chatCount = it.unreadCount.toString(),
                profileImageUrl = it.profileImageUrl
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ChatsScreenPrev() {
    WhatsAppTheme {
        ChatsScreen(threads = dummy.sampleThreads)
    }
}