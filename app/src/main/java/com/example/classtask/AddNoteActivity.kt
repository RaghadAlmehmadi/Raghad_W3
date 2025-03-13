package com.example.classtask

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class AddNoteActivity : AppCompatActivity() {

    private lateinit var editTitle: EditText
    private lateinit var editContent: EditText
    private lateinit var textCount: TextView
    private lateinit var btnSave: Button
    private lateinit var btnCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        editTitle = findViewById(R.id.edit_title)
        editContent = findViewById(R.id.edit_content)
        textCount = findViewById(R.id.text_count)
        btnSave = findViewById(R.id.btn_save)
        btnCancel = findViewById(R.id.btn_cancel)

        // Update character count as user types
        editContent.addTextChangedListener { text ->
            textCount.text = "Characters: ${text?.length ?: 0}"
        }

        btnSave.setOnClickListener {
            val title = editTitle.text.toString()
            val content = editContent.text.toString()

            // Send the note back to MainActivity
            val resultIntent = intent
            resultIntent.putExtra("noteTitle", title)
            resultIntent.putExtra("noteContent", content)
            setResult(RESULT_OK, resultIntent)
            finish()
        }

        btnCancel.setOnClickListener {
            finish() // Close the activity without saving
        }
    }
}
