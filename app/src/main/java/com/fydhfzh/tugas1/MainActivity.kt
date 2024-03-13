package com.fydhfzh.tugas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fydhfzh.tugas1.ui.theme.Tugas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxHeight(), color = MaterialTheme.colorScheme.background) {

                    Greeting("Android","5025201164", "Acumalaka")
                }
            }
        }
    }
}

@Composable
fun showImage() {
    Image(painter = painterResource(id = R.drawable.pngtree_frog_logo_template_toad_pattern_illustration_vector_png_image_39777606), contentDescription = null, colorFilter = ColorFilter.tint(Color(0xFF228B22)))
}

@Composable
fun showButton(modifier: Modifier = Modifier) {
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color(0xFF228B22))) {
        Text(text = "Go to Homepage")
    }
}

@Composable
fun Greeting(name: String, nrp: String, productName: String, modifier: Modifier = Modifier) {
    var gradientColor = listOf(Color.Green, Color.Blue, Color.Cyan)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        showImage()
        Text(
            text = "$productName",
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = gradientColor
                ),
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic
            )
        )
        Text(
            text = "Welcome to the App",
            color = Color(0xFF228B22),
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(40.dp))
        showButton()
    }
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .navigationBarsPadding()
            .fillMaxWidth()
    ) {
        Text(
            text = "Name: $name",
            color = Color.DarkGray,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )
        Text(
            text = "NRP: $nrp",
            color = Color.DarkGray,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL)
@Composable
fun GreetingPreview() {
    Tugas1Theme {
        Greeting("Fayyadh Hafizh", "5025201164", "Acumalaka")
    }
}