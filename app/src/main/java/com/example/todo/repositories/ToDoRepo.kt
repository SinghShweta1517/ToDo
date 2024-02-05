package com.example.todo.repositories

import com.example.todo.database.ToDoEntity
import kotlinx.coroutines.flow.Flow

interface ToDoRepo {
    suspend fun getTodos():Flow<List<ToDoEntity>>
    suspend fun addToDo(todo: ToDoEntity)
    suspend fun updateTodo(todo:ToDoEntity)
    suspend fun deleteTodo(todo:ToDoEntity)
}