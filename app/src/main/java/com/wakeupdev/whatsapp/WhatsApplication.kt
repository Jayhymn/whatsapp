package com.wakeupdev.whatsapp

import android.app.Application
import com.wakeupdev.whatsapp.NetworkClient.httpClient
import com.wakeupdev.whatsapp.calls.data.CallRepository
import com.wakeupdev.whatsapp.calls.data.CallRepositoryImpl
import com.wakeupdev.whatsapp.chats.data.ChatRepository
import com.wakeupdev.whatsapp.chats.data.ChatRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class WhatsApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@WhatsApplication)
            modules(appModule)
        }
    }
}

val appModule = module {
    single<ChatRepository> { ChatRepositoryImpl() }
    single<CallRepository> { CallRepositoryImpl() }
    single{ httpClient }
}