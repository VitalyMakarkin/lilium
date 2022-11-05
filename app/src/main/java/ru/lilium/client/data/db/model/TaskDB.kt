package ru.lilium.client.data.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskDB(
    val title: String,
    val description: String,
    val createdAt: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
