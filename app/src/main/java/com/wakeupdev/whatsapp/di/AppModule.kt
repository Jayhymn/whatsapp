package com.wakeupdev.whatsapp.di

import com.wakeupdev.whatsapp.NetworkClient.httpClient
import com.wakeupdev.whatsapp.calls.data.CallRepository
import com.wakeupdev.whatsapp.calls.data.CallRepositoryImpl
import com.wakeupdev.whatsapp.chats.data.ChatRepository
import com.wakeupdev.whatsapp.chats.data.ChatRepositoryImpl
import org.koin.dsl.module

val appModule = module {
    single<ChatRepository> { ChatRepositoryImpl() }
    single<CallRepository> { CallRepositoryImpl() }
    single{ httpClient }
}