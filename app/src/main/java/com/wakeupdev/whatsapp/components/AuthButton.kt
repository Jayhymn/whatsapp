package com.wakeupdev.whatsapp.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme

@Composable
fun AuthButton(
        modifier: Modifier = Modifier,
        text: String,
    ) {
    FilledTonalButton(
        modifier = Modifier.fillMaxWidth(),
        onClick = {}
    ) {
        Text(text, style = MaterialTheme.typography.bodyLarge,)
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun AuthButtonPrev() {
    WhatsAppTheme {
        AuthButton(text = "Login")
    }
}