package com.wakeupdev.whatsapp.calls.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun CallsScreen(modifier: Modifier = Modifier) {
    Text("Call screen")
}


@Preview
@Composable
private fun CallsScreenPrev() {
    WhatsAppTheme {
        CallsScreen()
    }
}