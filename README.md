## ClassTask App

**Overview**

ClassTask is a simple Android app that allows users to add, view, and manage notes. The app follows the Model-View-Controller (MVC) architecture using Kotlin and Android Jetpack components.

**Features**

Display a list of notes.

Add a new note with a title and content.

Store notes temporarily within the app.

## Screenshots

**1. Before Adding a Note**
<img width="1440" alt="image1" src="https://github.com/user-attachments/assets/4c350ce8-d858-45e4-b385-67f15dfe6cdf" />


**2. Adding a Note**
<img width="1440" alt="imag2" src="https://github.com/user-attachments/assets/2198f1b3-f2c0-4b4b-89c7-77088a630589" />


**3. After Saving the Note**
<img width="1440" alt="image3" src="https://github.com/user-attachments/assets/eb8a1ba3-f09c-41e6-99f2-b01746ea5907" />


**1. MainActivity.kt**

Displays a list of notes using RecyclerView.

Uses FloatingActionButton to navigate to AddNoteActivity.

Handles the result from AddNoteActivity to add a new note to the list.

**2. AddNoteActivity.kt**

Provides a form for users to enter a note title and content.

Returns the note data to MainActivity when saved.

**3. Note.kt (class data)**

Defines the Note data class with two properties: title and content.

**4. NoteAdapter.kt (Adapter)**

Handles displaying the list of notes inside a RecyclerView.

Binds note data to the UI components of each list item.


## Layout Files

**1. activity_main.xml**

Contains a RecyclerView to display notes.

Includes a FloatingActionButton for adding new notes.

**2. activity_add_note.xml**

Contains EditText fields for entering a note title and content.

Includes a Button to save the note.

**3. item_note.xml**

Defines the layout for a single note item in the RecyclerView.

Displays the note title and content.

## How to Run the Project

Clone the repository.

Open the project in Android Studio.

Sync Gradle and build the project.

Run the app on an emulator or a physical device.
