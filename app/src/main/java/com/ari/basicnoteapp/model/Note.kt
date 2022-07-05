package com.ari.basicnoteapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.*

@Entity (tableName = "notes_table")
data class Note(
    @PrimaryKey
    val id : UUID = UUID.randomUUID(),

    @ColumnInfo(name = "note_title")
    val title : String,

    @ColumnInfo(name = "note_desc")
    val description : String,

    @ColumnInfo(name = "note_entry")
    val entryDate : Date = Date.from(Instant.now())
)
