package com.wakeupdev.whatsapp.calls.data

data class Call(
    val contactName: String,
    val profileImageUrl: String,
    val dateTime: String,
    val isInComing: Boolean
)
