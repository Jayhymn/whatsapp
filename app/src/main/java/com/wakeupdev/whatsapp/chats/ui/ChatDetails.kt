package com.wakeupdev.whatsapp.chats.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

// composable for chat time and count
@Composable
fun ChatDetails(modifier: Modifier = Modifier, dateTime: String, chatCount: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            dateTime, style = MaterialTheme.typography.bodyMedium
        )
        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
                .background(color = MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                chatCount, color = Color.White, style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ChatDetailsPrev() {
    WhatsAppTheme {
        ChatDetails(
            dateTime = "23:01",
            chatCount = "2",
        )
    }
}