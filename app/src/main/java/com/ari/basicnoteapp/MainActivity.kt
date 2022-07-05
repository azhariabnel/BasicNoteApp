package com.ari.basicnoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ari.basicnoteapp.data.NoteDataSource
import com.ari.basicnoteapp.model.Note
import com.ari.basicnoteapp.screen.NoteScreen
import com.ari.basicnoteapp.screen.NoteViewModel
import com.ari.basicnoteapp.ui.theme.BasicNoteAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicNoteAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val noteViewModel: NoteViewModel by viewModels()
                    NotesApp(noteViewModel)
                }
            }
        }
    }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel){
    val noteList = noteViewModel.noteList.collectAsState().value
    NoteScreen(notes = noteList, onAddNote = {
        noteViewModel.addNote(it)
    }, onRemoveNote = {
        noteViewModel.removeNote(it)
    })
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicNoteAppTheme {
    }
}