package com.ari.basicnoteapp.data

import com.ari.basicnoteapp.model.Note

class NoteDataSource{
    fun loadNotes() : List<Note>{
        return listOf(
            Note(title = "Test 1", description = "This is a test 1"),
            Note(title = "Test 2", description = "This is a test 2"),
            Note(title = "Test 3", description = "This is a test 3"),
            Note(title = "Test 4", description = "This is a test 4"),
            Note(title = "Test 5", description = "This is a test 5"),
            Note(title = "Test 6", description = "This is a test 6")
        )
    }
}