package com.wakeupdev.whatsapp.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CallEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val contactName: String,
    val profileImageUrl: String,
    val dateTime: String,
    val isInComing: Boolean
)
