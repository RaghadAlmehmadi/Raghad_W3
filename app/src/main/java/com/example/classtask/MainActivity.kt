package com.example.classtask

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app.adapter.NoteAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : ComponentActivity() {
   // override fun onCreate(savedInstanceState: Bundle?) {}
        private lateinit var recyclerView: RecyclerView
        private lateinit var noteAdapter: NoteAdapter
        private lateinit var fabAdd: FloatingActionButton
        private val noteList = mutableListOf(
            Note("First Note", "My name is Raghad"),
        )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.classtask)

            recyclerView = findViewById(R.id.recyclerView)
            fabAdd = findViewById(R.id.fab_add)

            noteAdapter = NoteAdapter(noteList)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = noteAdapter

            // Floating Action Button Click: Open AddNoteActivity
            fabAdd.setOnClickListener {
                val intent = Intent(this, AddNoteActivity::class.java)
                startActivityForResult(intent, REQUEST_CODE_ADD_NOTE)
            }
        }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)

            if (requestCode == REQUEST_CODE_ADD_NOTE && resultCode == RESULT_OK) {
                val title = data?.getStringExtra("noteTitle") ?: ""
                val content = data?.getStringExtra("noteContent") ?: ""

                if (title.isNotEmpty() && content.isNotEmpty()) {
                    noteList.add(Note(title, content))
                    noteAdapter.notifyDataSetChanged()
                }
            }
        }

        companion object {
            const val REQUEST_CODE_ADD_NOTE = 1
        }

}




