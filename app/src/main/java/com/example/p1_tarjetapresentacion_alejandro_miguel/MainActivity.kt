package com.example.p1_tarjetapresentacion_alejandro_miguel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.p1_tarjetapresentacion_alejandro_miguel.ui.theme.P1_TarjetaPresentacion_Alejandro_MiguelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp, vertical = 25.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .background(color = Color.Blue)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(color = Color.Cyan)
            ) {
                Text(text = "hola hola pasa pasa 1")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(color = Color.Cyan)
            ) {
                Text(text = "hola hola pasa pasa 2")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(color = Color.Cyan)
            ) {
                Text(text = "hola hola pasa pasa 3")
            }
        }

        Column(
            Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    Modifier.size(25.dp)
                )

                Column() {
                    Text(text = "+00 (00) 000 000", Modifier.width(180.dp))
                }
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    Modifier.size(25.dp)
                )

                Column() {
                    Text(text = "@socialmediahandle", Modifier.width(180.dp))
                }
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    Modifier.size(25.dp)
                )

                Column() {
                    Text(text = "email@domail.com", Modifier.width(180.dp))
                }
            }
        }
    }
}
