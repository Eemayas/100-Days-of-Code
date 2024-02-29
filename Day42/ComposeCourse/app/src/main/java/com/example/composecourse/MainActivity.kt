package com.example.composecourse

import android.os.Bundle
import android.view.MotionEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.ui.theme.ComposeCourseTheme
import java.lang.Math.PI
import kotlin.math.atan2
import kotlin.math.roundToInt
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff101010))
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .wrapContentHeight()
                        .border(1.dp, Color.Green, RoundedCornerShape(10.dp))
                        .padding(30.dp)
                ) {
                    var volume by remember {
                        mutableStateOf(0f)
                    }
                    val barCount=10
                    MusicKnob(modifier = Modifier.size(100.dp)
                        ){
                        volume=it
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    VolumeBar(
                        modifier=Modifier.fillMaxSize().height(30.dp),
                        activeBars=(barCount*volume).roundToInt(),
                        barCount=barCount

                    )
                }
            }
        }

// Day 50
//        setContent {
//            Box(
//                modifier = Modifier.fillMaxSize(),
//                contentAlignment = Alignment.Center
//            ) {
//                CircularProgressBar(percentage = 0.8f, number = 100)
//            }
//
//        }
// Day 49
//        setContent {
//            var sizeState by remember { mutableStateOf(200.dp) }
//            val size by animateDpAsState(
//                targetValue = sizeState,
//                animationSpec =
////                keyframes {
////                    durationMillis = 5000
////                    sizeState at 0 with LinearEasing
////                    sizeState * 1.5f at 1000 with FastOutLinearInEasing
////                    sizeState * 2f at 5000
////
////                },
//                tween(durationMillis = 1000),
//                label = ""
//            )
//
//            //For Infinite Animation
//            val infiniteTransition = rememberInfiniteTransition(label = "");
//            val color by infiniteTransition.animateColor(
//                initialValue = Color.Red,
//                targetValue = Color.Green,
//                animationSpec = InfiniteRepeatableSpec(
//                    tween(durationMillis = 2000),
//                    repeatMode = RepeatMode.Reverse
//                ), label = ""
//            )
//            Box(
//                modifier = Modifier
//                    .size(size)
//                    .size(sizeState)
//                    .background(color),
//                contentAlignment = Alignment.Center,
//            ) {
//                Button(onClick = { sizeState += 50.dp }) {
//                    Text("Increase Size")
//                }
//            }
//
//        }

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
fun VolumeBar(
    modifier: Modifier = Modifier,
    activeBars: Int = 0,
    barCount: Int = 10
) {
    BoxWithConstraints(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        val barWidth = remember {
            constraints.maxWidth / (2f * barCount)
        }
        Canvas(modifier = modifier) {
            for (i in 0 until barCount) {
                drawRoundRect(
                    color = if (i in 0..activeBars) Color.Green else Color.DarkGray,
                    topLeft = Offset(i * barWidth * 2f + barWidth / 2, 0f),
                    size = Size(barWidth, constraints.maxWidth.toFloat()),
                    cornerRadius = CornerRadius(5f)
                )
            }
        }
    }
}


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MusicKnob(

    modifier: Modifier = Modifier,
    limitingAngle: Float = 25f,
    onValueChange: (Float) -> Unit,

    ) {
    var rotation by remember {
        mutableStateOf(limitingAngle)
    }
    var touchX by remember {
        mutableStateOf(0f)
    }
    var touchY by remember {
        mutableStateOf(0f)
    }
    var centerX by remember {
        mutableStateOf(0f)
    }
    var centerY by remember {
        mutableStateOf(0f)
    }

    Image(
        painter = painterResource(id = (R.drawable.music_knob)),
        contentDescription = "Music Knob",
        modifier = modifier
            .fillMaxSize()
            .onGloballyPositioned {
                val windowBounds = it.boundsInWindow()
                centerX = windowBounds.size.width / 2
                centerY = windowBounds.size.height / 2
            }
            .pointerInteropFilter { event ->
                touchX = event.x
                touchY = event.y
                val angle = -atan2(centerX - touchX, centerY - touchY) * (180f / PI).toFloat()

                when (event.action) {
                    MotionEvent.ACTION_DOWN,
                    MotionEvent.ACTION_MOVE -> {
                        if (angle !in -limitingAngle..limitingAngle) {
                            val fixedAngle = if (angle in -180f..limitingAngle) {
                                360f + angle
                            } else {
                                angle
                            }

                            rotation = fixedAngle

                            val percent = (fixedAngle - limitingAngle) / (360f - 2 * limitingAngle)
                            onValueChange(percent)
                            true

                        } else false

                    }

                    else -> false
                }

            }
            .rotate(rotation)
    )
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
fun CircularProgressBar(
    percentage: Float,
    number: Int,
    fontSize: TextUnit = 28.sp,
    radius: Dp = 50.dp,
    color: Color = Color.Green,
    strokeWidth: Dp = 8.dp,
    animationDuration: Int = 1000,
    animationDelay: Int = 0,

    ) {
    var animationPlayed by remember {
        mutableStateOf(false)
    }

    val currentPercentage =
        animateFloatAsState(
            targetValue = if (animationPlayed) percentage else 0f,
            animationSpec = tween(
                durationMillis = animationDuration,
                delayMillis = animationDelay
            )
        )
    LaunchedEffect(key1 = true) {
        animationPlayed = true
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(radius * 2f)
    ) {
        Canvas(modifier = Modifier.size(radius * 2f)) {
            drawArc(
                color = color,
                startAngle = -90f,
                sweepAngle = 360 * currentPercentage.value,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )
        }
        Text(
            text = (currentPercentage.value * number).toInt().toString(),
            color = Color.Black,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )
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