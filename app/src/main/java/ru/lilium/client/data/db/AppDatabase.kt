package ru.lilium.client.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.lilium.client.data.db.dao.TasksDao
import ru.lilium.client.data.db.model.TaskDB

@Database(
    entities = [TaskDB::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun tasksDao(): TasksDao
}