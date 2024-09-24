package br.com.rafaseron.blankapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.rafaseron.blankapp.data.local.dao.ModelDao
import br.com.rafaseron.blankapp.data.local.entities.ModelEntity

@Database(entities = [ModelEntity::class], version = 1)
abstract class AppDatabase(): RoomDatabase(){
    abstract fun modelDao(): ModelDao

}