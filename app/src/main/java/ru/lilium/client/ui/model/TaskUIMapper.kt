package ru.lilium.client.ui.model

import ru.lilium.client.domain.model.Task

fun Task.mapToTaskListItemUI() =
    TaskListItemUI(
        id = this.id,
        title = this.title,
        createdAt = this.createdAt
    )

fun Task.mapToTaskDetailUI() =
    TaskDetailUI(
        id = this.id,
        title = this.title,
        description = this.description,
        createdAt = this.createdAt
    )

