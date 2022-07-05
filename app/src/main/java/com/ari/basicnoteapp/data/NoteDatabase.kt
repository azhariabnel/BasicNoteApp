package com.ari.basicnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ari.basicnoteapp.model.Note
import com.ari.basicnoteapp.util.DateConverter
import com.ari.basicnoteapp.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}