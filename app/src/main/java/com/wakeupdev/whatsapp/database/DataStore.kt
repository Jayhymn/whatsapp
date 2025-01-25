package com.wakeupdev.whatsapp.database

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "user_preferences")

val IS_LOGGED_IN_KEY = booleanPreferencesKey("is_logged_in")

fun readUserName(context: Context): Flow<Boolean?> {
    return context.dataStore.data
        .map { preferences ->
            // Retrieve the user name from preferences
            preferences[IS_LOGGED_IN_KEY]
        }
}

suspend fun saveUserName(context: Context, isLoggedIn: Boolean) {
    context.dataStore.edit { preferences ->
        preferences[IS_LOGGED_IN_KEY] = isLoggedIn
    }
}
