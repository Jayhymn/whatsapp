package com.wakeupdev.whatsapp.components

import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun AuthButton(modifier: Modifier = Modifier, text: String,) {
    FilledTonalButton(onClick = {}) {
        Text(text)
    }
}

@Preview
@Composable
private fun AuthButtonPrev() {
    WhatsAppTheme {
        AuthButton(text = "Login")
    }
}