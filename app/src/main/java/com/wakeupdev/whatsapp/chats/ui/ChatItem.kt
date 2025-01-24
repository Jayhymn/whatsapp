package com.wakeupdev.whatsapp.chats.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.wakeupdev.whatsapp.R
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun ChatItem(
    modifier: Modifier = Modifier.fillMaxWidth(),
    chatTitle: String,
    lastChat: String,
    dateTime: String,
    chatCount: String,
    profileImageUrl: String
) {
    Row(modifier = Modifier
        .padding(5.dp)
        .fillMaxWidth()
    ) {
        AsyncImage(
            model = profileImageUrl,
            contentDescription = "Profile Picture",
            placeholder = painterResource(R.drawable.ic_person),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(color = Color.Gray)
        )
        Spacer(Modifier.width(8.dp))
        Chat(chatTitle, lastChat)
        Spacer(Modifier.weight(1F))
        ChatDetails(dateTime = dateTime, chatCount = chatCount)
    }
}

@Preview(showBackground = true)
@Composable
private fun ChatItemPrev() {
    WhatsAppTheme {
        ChatItem(
            chatTitle = "Friend's Hangout",
            lastChat = "I'm hoping for a really good time",
            dateTime = "12:32",
            chatCount = "3",
            profileImageUrl = ""
        )
    }
}

// composable for chat component
@Composable
private fun Chat(chatTitle: String, lastchat: String) {
    Column {
        Text(
            chatTitle,
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Medium),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Text(
            lastchat,
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Light),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ChatPrev() {
    WhatsAppTheme {
        Chat(
            chatTitle = "Friends hanging out",
            lastchat = "I'm hoping for a really big discount"
        )
    }
}