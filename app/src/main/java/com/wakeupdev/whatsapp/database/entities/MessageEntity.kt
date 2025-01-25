package com.wakeupdev.whatsapp.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MessageEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val contactName: String,
    val isSent: Boolean,
    val message: String,
    val dateTime: String
)