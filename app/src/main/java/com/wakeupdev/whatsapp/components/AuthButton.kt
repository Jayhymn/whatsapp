package com.wakeupdev.whatsapp.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.ui.theme.WhatsAppGreen
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun AuthButton(
        modifier: Modifier = Modifier,
        text: String,
    ) {
    FilledTonalButton(
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonColors(
            contentColor = Color.White,
            containerColor = WhatsAppGreen,
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.White
        ),
        onClick = {}
    ) {
        Text(text, style = MaterialTheme.typography.bodyLarge,)
    }
}

@Preview
@Composable
private fun AuthButtonPrev() {
    WhatsAppTheme {
        AuthButton(text = "Login")
    }
}