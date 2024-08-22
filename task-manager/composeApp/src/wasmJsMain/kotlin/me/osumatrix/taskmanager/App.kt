package me.osumatrix.taskmanager

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                var username by remember { mutableStateOf("Hello") }
                var description by remember { mutableStateOf("World") }
                var dateTime by remember { mutableStateOf("2021-01-01T00:00:00") }

                ElevatedCard {
                    TextField(
                        value = username,
                        onValueChange = { username = it },
                        label = { Text("Enter your name") },
                    )

                    TextField(
                        value = description,
                        onValueChange = { description = it },
                        label = { Text("Enter description") },
                    )

                    TextField(
                        value = dateTime,
                        onValueChange = { dateTime = it },
                        label = { Text("Enter date and time") },
                    )
                }

                Spacer(Modifier.width(2.dp))

                Button({
                    println("Username: $username, Description: $description, Date and time: $dateTime")
                }) {
                    Text("Submit")
                }
            }
        }
    }
}
