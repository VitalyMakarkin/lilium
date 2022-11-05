package ru.lilium.client.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ru.lilium.client.data.db.model.TaskDB

@Dao
interface TasksDao {
    @Query("SELECT * FROM tasks")
    fun getTasks(): List<TaskDB>

    @Query("SELECT * FROM tasks WHERE id = :id")
    fun getTask(id: Int): TaskDB

    @Insert
    fun insertTask(vararg tasks: TaskDB)

    @Query("DELETE FROM tasks WHERE id = :id")
    fun deleteTask(id: Int)
}
