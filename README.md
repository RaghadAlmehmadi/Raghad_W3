Project: Android Profile Screen
This Android project demonstrates the use of Jetpack Compose for building a profile screen with interactive UI elements. The application displays a profile picture, name, major, and a follow button that toggles between "Follow" and "Following". It also counts and displays the number of followers.
Features
•	Profile Section: Displays a profile picture, the user's name, and major.
•	Follow Button: Allows users to toggle between "Follow" and "Following". The button's text changes based on the state.
•	Followers Counter: Shows the number of followers, which can be updated by clicking the follow button.
Components Used
•	Jetpack Compose: The UI framework used to build the layout and manage state.
•	Image: Display a profile picture using painterResource.
•	Text: Used for displaying the user's name, major, and follower count.
•	Button: A clickable button that toggles between "Follow" and "Following".
•	State Management: The mutableStateOf is used to store the follower count and button state.
UI Structure
•	Profile Picture: An image centered in the layout.
•	Text Information: Displays user details like name and major in a column format.
•	Follow Button: A button that toggles between two states when clicked, updating the follower count.
How It Works
1.	When the app starts, the profile screen is displayed.
2.	The user can click the "Follow" button to toggle the follow status.
3.	The follower count is displayed and updates when the button is clicked.
Dependencies
•	Jetpack Compose: For building UI with composable functions.
•	Material3: For material design components like buttons and text styling.
How to Run
1.	Clone or download the repository.
2.	Open the project in Android Studio.
3.	Ensure that you have the necessary SDKs and dependencies installed.
4.	Run the app on an emulator or a physical Android device.
   
