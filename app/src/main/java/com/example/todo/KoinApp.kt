package com.example.todo

import android.app.Application
import androidx.room.Room
import com.example.todo.database.ToDoDatabase
import com.example.todo.repositories.ToDoRepo
import com.example.todo.repositories.ToDoRepoImpl
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

class KoinApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(module{
                single{
                    Room.databaseBuilder(this@KoinApp,ToDoDatabase::class.java,"db")
                        .build()

                }
                single {
                    ToDoRepoImpl(database = get())
                } bind ToDoRepo::class
            })

        }
    }
}