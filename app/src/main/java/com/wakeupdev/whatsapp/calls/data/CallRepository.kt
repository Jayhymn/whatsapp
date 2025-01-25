package com.wakeupdev.whatsapp.calls.data

import com.wakeupdev.whatsapp.database.entities.CallEntity

interface CallRepository {
    fun getCallHistory(): List<CallEntity>
}

class CallRepositoryImpl: CallRepository {
    override fun getCallHistory(): List<CallEntity> {
        TODO("Not yet implemented")
    }

}