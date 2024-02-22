package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.opensans_bold),
            Font(R.font.opensans_bolditalic),
            Font(R.font.opensans_condensed_semibold),
        )
        setContent {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(
                        Color(0xFF101010)
                    )
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp,
                            )
                        ) {
                            append("P")
                        }
                        append("rashant")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp,
                            )
                        ) {
                            append("M")
                        }
                        append("anandhar")
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily, fontWeight = FontWeight(500),
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center
                )
            }

//Day 43
//            val painter = painterResource(id = R.drawable.photo);
//            val description = "Prashant";
//            val title = "Prashant Manandhar Photo";
//            Box(
//                Modifier
//                    .fillMaxHeight(0.5f)
//                    .padding(16.dp)
//            ) {
//                ImageCard(painter = painter, contentDescriptorss = description, title = title)
//            }
//

// Day 42
//
//            Column(Modifier.background(Color.Green).fillMaxHeight().width(600.dp). requiredWidth(300.dp).padding(50.dp,0.dp
//            ),) {
//                Text(text = "Hello Prashant",Modifier
//                        .offset(0.dp,20.dp))
//                Text(text = "Hello Manandhar")
//                Row {
//                    Text(text = "Hello Prashant",Modifier
//                        .offset(50.dp,20.dp))
//                    Text(text = "Hello Manandhar")
//                }  }

        }
    }

}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescriptorss: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxHeight(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(

                painter = painter,
                contentDescription = contentDescriptorss,
                contentScale = ContentScale.FillHeight, modifier = Modifier.fillMaxSize(),
            )
            Box(
                Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black,
                            ),
                            startY = 300f,

                            )
                    )
            )
            Box(
                Modifier
                    .fillMaxHeight()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    title, style = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp,
                    )
                )
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeCourseTheme {
        Greeting("Prashan")
    }
}