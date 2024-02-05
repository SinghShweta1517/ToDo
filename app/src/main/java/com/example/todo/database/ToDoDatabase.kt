package com.example.todo.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ToDoEntity::class], version = 1)
abstract class ToDoDatabase:RoomDatabase (){
    abstract  fun todoDao():ToDoDao
}