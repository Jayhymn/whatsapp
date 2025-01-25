package com.wakeupdev.whatsapp.calls.data

interface CallRepository {
    fun getCallHistory(): List<Call>
}

class CallRepositoryImpl: CallRepository {
    override fun getCallHistory(): List<Call> {
        TODO("Not yet implemented")
    }

}