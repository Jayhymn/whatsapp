package com.wakeupdev.whatsapp.statuses

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun StatusScreen(modifier: Modifier = Modifier) {
    Text("Status screen")
}

@Preview
@Composable
private fun StatusScreenPrev() {
    WhatsAppTheme {
        StatusScreen()
    }
}