package com.wakeupdev.whatsapp.chats

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun ChatsScreen(modifier: Modifier = Modifier) {
    Text(modifier = Modifier, text =  "Chat screen")
}

@Preview
@Composable
private fun ChatsScreenPrev() {
    WhatsAppTheme {
        ChatsScreen()
    }
}