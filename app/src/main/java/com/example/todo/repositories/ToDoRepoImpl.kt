package com.example.todo.repositories

import com.example.todo.database.ToDoDatabase
import com.example.todo.database.ToDoEntity
import kotlinx.coroutines.flow.Flow

class ToDoRepoImpl (private val database: ToDoDatabase):ToDoRepo{
    private val dao = database.todoDao()

    override suspend fun getTodos(): Flow<List<ToDoEntity>> = dao.getTodos()
    override suspend fun addToDo(todo: ToDoEntity) = dao.addToDo(todo)
    override suspend fun updateTodo(todo: ToDoEntity) = dao.updateTodo(todo)
    override suspend fun deleteTodo(todo: ToDoEntity) = dao.deleteTodo(todo)
}