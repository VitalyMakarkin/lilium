package ru.lilium.client.data.db.model

import ru.lilium.client.domain.model.Task

fun TaskDB.mapToTaskDomain() =
    Task(
        id = this.id,
        title = this.title,
        description = this.description,
        createdAt = this.createdAt
    )

fun Task.mapToTaskDB() =
    TaskDB(
        title = this.title,
        description = this.description,
        createdAt = this.createdAt
    )