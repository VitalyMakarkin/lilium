package ru.lilium.client.data.repository

import ru.lilium.client.data.db.dao.TasksDao
import ru.lilium.client.data.db.model.mapToTaskDB
import ru.lilium.client.data.db.model.mapToTaskDomain
import ru.lilium.client.domain.model.Task
import javax.inject.Inject

class TasksRepository @Inject constructor(
    private val tasksDao: TasksDao
) {
    fun getTasks(): List<Task> {
        return tasksDao.getTasks().map { it.mapToTaskDomain() }
    }

    fun getTask(id: Int): Task {
        return tasksDao.getTask(id).mapToTaskDomain()
    }

    fun createTask(task: Task) {
        tasksDao.insertTask(task.mapToTaskDB())
    }

    fun deleteTask(id: Int) {
        tasksDao.deleteTask(id)
    }
}