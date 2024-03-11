package com.example.todolist
import androidx.room.Entity

@Entity(tableName="notes_table")
class Note(val text:String) {

}