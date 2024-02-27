package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.ui.theme.ComposeCourseTheme
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var sizeState by remember { mutableStateOf(200.dp) }
            val size by animateDpAsState(
                targetValue = sizeState,
                animationSpec =
//                keyframes {
//                    durationMillis = 5000
//                    sizeState at 0 with LinearEasing
//                    sizeState * 1.5f at 1000 with FastOutLinearInEasing
//                    sizeState * 2f at 5000
//
//                },
                tween(durationMillis = 1000),
                label = ""
            )

            //For Infinite Animation
            val infiniteTransition = rememberInfiniteTransition(label = "");
            val color by infiniteTransition.animateColor(
                initialValue = Color.Red,
                targetValue = Color.Green,
                animationSpec = InfiniteRepeatableSpec(
                    tween(durationMillis = 2000),
                    repeatMode = RepeatMode.Reverse
                ), label = ""
            )
            Box(
                modifier = Modifier
                    .size(size)
                    .size(sizeState)
                    .background(color),
                contentAlignment = Alignment.Center,
            ) {
                Button(onClick = { sizeState += 50.dp }) {
                    Text("Increase Size")
                }
            }

        }

// Day 48
//        setContent {
//
//            val constraints = ConstraintSet {
//                val greenBox = createRefFor("greenbox")
//                val redBox = createRefFor("redbox")
//                val guideline=createGuidelineFromTop(0.5f)
//
//                constrain(greenBox) {
//                    top.linkTo(guideline)
//                    start.linkTo(parent.start)
//                    width = Dimension.value(100.dp)
//                    height = Dimension.value(100.dp)
//
//                }
//                constrain(redBox) {
//                    top.linkTo(parent.top)
//                    start.linkTo(greenBox.end)
//                    end.linkTo(parent.end)
//                    width = Dimension.value(100.dp)
//                    height = Dimension.value(100.dp)
//                }
//                createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
//            }
//
//            ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {
//                Box(
//                    modifier = Modifier.background(Color.Green)
//                        .layoutId("greenbox")
//                )
//                Box(
//                    modifier = Modifier.background(Color.Red)
//                        .layoutId("redbox")
//                )
//            }
//        }

// Day 47
//// ListView using LazyColumn
//        setContent{
//            LazyColumn{
//                itemsIndexed(   //equivalent to for each loop
//                    listOf("This","is","JetPack","Compose")
//                )
//                {
//                    index,string->  Text(
//                    text = string,
//                    fontSize = 24.sp,
//                    textAlign= TextAlign.Center,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(vertical = 24.dp)
//                )
//                }
////                items(5000){      //equivalent to for loop
////                    Text(
////                        text = "Item $it",
////                        fontSize = 24.sp,
////                        textAlign= TextAlign.Center,
////                        fontWeight = FontWeight.Bold,
////                        modifier = Modifier
////                            .fillMaxWidth()
////                            .padding(vertical = 24.dp)
////                    )
////                }
//            }
//        }


        // Make listView by columns
//        setContent {
//            val scrollState= rememberScrollState()
//            Column(Modifier.verticalScroll(scrollState)) {
//                for (i in 1..50) {
//                    Text(
//                        text = "Item $i",
//                        fontSize = 24.sp,
//                        textAlign= TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//
//                }
//            }
//        }


// Day 46
//        setContent {
//            val snackbarHostState = remember { SnackbarHostState() }
//            var textFieldState by remember {
//                mutableStateOf("")
//            }
//            val scope = rememberCoroutineScope()
//
//
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(horizontal = 30.dp),
//            ) {
//                TextField(
//                    value = textFieldState,
//                    label = {
//                        Text("Enter your name")
//                    },
//                    onValueChange = {
//                        textFieldState = it
//                    },
//                    singleLine = true,
//                    modifier = Modifier.fillMaxWidth(),
//                )
//                Spacer(Modifier.height(16.dp))
//                Button(onClick = {
//                    scope.launch {
//                        snackbarHostState.showSnackbar("Hello $textFieldState")
//                    }
//                }) {
//                    Text("Please Greet Me")
//                }
//            }
//
//        }

// Day 45
//        setContent {
//            Column(
//                Modifier.fillMaxSize()
//            ) {
//                val color = remember {
//                    mutableStateOf(Color.Yellow)
//                }
//                ColorBox(
//                    Modifier
//                        .weight(1f)
//                        .fillMaxSize()
//
//                ){
//                    color.value=it
//                }
//                Box(
//                    Modifier
//                        .background(color.value)
//                        .weight(1f)
//                        .fillMaxSize()
//                )
//            }
//    }

// Day 44
//        val fontFamily = FontFamily(
//            Font(R.font.opensans_bold),
//            Font(R.font.opensans_bolditalic),
//            Font(R.font.opensans_condensed_semibold),
//        )
//        setContent {
//            Box(
//                Modifier
//                    .fillMaxSize()
//                    .background(
//                        Color(0xFF101010)
//                    )
//            ) {
//                Text(
//                    text = buildAnnotatedString {
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Green,
//                                fontSize = 50.sp,
//                            )
//                        ) {
//                            append("P")
//                        }
//                        append("rashant")
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Green,
//                                fontSize = 50.sp,
//                            )
//                        ) {
//                            append("M")
//                        }
//                        append("anandhar")
//                    },
//                    color = Color.White,
//                    fontSize = 30.sp,
//                    fontFamily = fontFamily, fontWeight = FontWeight(500),
//                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center
//                )
//            }
//    }

// Day 43
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

//        }
//    }
    }
}


@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {


    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )

        }
    ) {

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