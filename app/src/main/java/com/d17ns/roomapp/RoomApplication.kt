package com.d17ns.roomapp

import android.app.Application
import com.d17ns.roomapp.data.ItemRoomDatabase

class RoomApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}