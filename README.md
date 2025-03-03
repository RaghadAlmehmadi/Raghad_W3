Overview
This is an Android application that demonstrates the activity lifecycle by logging lifecycle events (onCreate(), onStart(), onResume(), onPause(), and onDestroy()) in Logcat.
Features
Logs lifecycle events: onCreate(), onStart(), onResume(), onPause(), and onDestroy()
Provides real-time logs in Logcat to track activity state changes
Simple user interface to observe lifecycle behavior
Lifecycle Events Logged
onCreate() – The activity is being created for the first time
onStart() – The activity is becoming visible to the user
onResume() – The activity is now interactive and in the foreground
onPause() – Another activity is coming to the foreground, partially covering this one
onDestroy() – The activity is being destroyed and removed from memory.
How to Run the App
Open the project in Android Studio.
Click "Run" to build and launch the app on an emulator or physical device.
Open Logcat in Android Studio.
Set the log level to "Debug."
Filter logs by the tag "Lifecycle."
The lifecycle logs should appear when interacting with the app.
