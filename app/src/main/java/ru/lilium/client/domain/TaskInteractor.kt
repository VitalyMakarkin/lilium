package ru.lilium.client.domain

import ru.lilium.client.data.repository.TasksRepository
import ru.lilium.client.domain.model.Task
import javax.inject.Inject

class TaskInteractor @Inject constructor(
    private val tasksRepository: TasksRepository
) {
    fun getTasks(): List<Task> {
        return tasksRepository.getTasks()
    }

    fun getTask(id: Int): Task {
        return tasksRepository.getTask(id)
    }

    fun createTask(task: Task) {
        return tasksRepository.createTask(task)
    }

    fun deleteTask(id: Int) {
        return tasksRepository.deleteTask(id)
    }
}