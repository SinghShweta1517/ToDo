package com.example.todo.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Date

@Entity("todos")
data class ToDoEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0 ,
    @ColumnInfo("title")
    val title : String ,
    @ColumnInfo("sub-title")
    val subTitle : String,
    @ColumnInfo("done")
    val done : Boolean = false,
    @ColumnInfo("added")
    val adder:Long= System.currentTimeMillis()
)

val ToDoEntity.addDate:String get() = SimpleDateFormat("yyyy/MM/dd hh:mm").format(Date(adder))
