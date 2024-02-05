package com.example.todo.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {
    @Insert
    fun addToDo(toDo: ToDoEntity)

    @Query("SELECT * FROM 'TODOS' ")
    fun getTodos(): Flow<List<ToDoEntity>>

    @Update
    fun updateTodo(toDo: ToDoEntity)

    @Delete
    fun deleteTodo(toDo: ToDoEntity)
}