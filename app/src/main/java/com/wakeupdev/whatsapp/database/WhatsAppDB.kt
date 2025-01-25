package com.wakeupdev.whatsapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wakeupdev.whatsapp.database.dao.CallDao
import com.wakeupdev.whatsapp.database.dao.MessageDao
import com.wakeupdev.whatsapp.database.entities.CallEntity
import com.wakeupdev.whatsapp.database.entities.MessageEntity

@Database(entities = [CallEntity::class, MessageEntity::class], version = 1, exportSchema = false)
abstract class WhatsAppDB : RoomDatabase() {

    abstract fun callDao(): CallDao
    abstract fun messageDao(): MessageDao
}
