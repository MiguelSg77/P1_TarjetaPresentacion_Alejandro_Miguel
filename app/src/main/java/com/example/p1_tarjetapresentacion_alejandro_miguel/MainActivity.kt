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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_alejandro_miguel.ui.theme.P1_TarjetaPresentacion_Alejandro_MiguelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFB8AA7B)) {
                    Greeting()

                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
        //Primera columna: Alex
        Column(
            Modifier
                .padding(horizontal = 15.dp)
                .fillMaxWidth(),

            verticalArrangement = Arrangement.Center


        ) {
            Row(
                Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.jesussaludandokotlin),
                    contentDescription = null,
                    Modifier.size(200.dp)
                )
            }
            Row(
                Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = stringResource(R.string.Nombre_de_Equipo), fontWeight = FontWeight.Bold, fontSize = 40.sp, textAlign = TextAlign.Center)
            }
            Row(
                Modifier
                    .padding(vertical = 3.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ) {
                Text(text = stringResource(R.string.Descripcion), fontSize = 20.sp, textAlign = TextAlign.Center)
            }
        }


    // Parte Miguel
    Column(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Bottom),
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = stringResource(R.string.numTelefono),
                    fontFamily = FontFamily.Serif,
                    color = Color.Magenta
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = stringResource(R.string.redSocial),
                    fontFamily = FontFamily.Serif,
                    color = Color.Magenta
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = stringResource(R.string.email),
                    fontFamily = FontFamily.Serif,
                    color = Color.Magenta
                )
            }
        }
    }

}
