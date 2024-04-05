package com.example.wgraceapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.wgraceapp.ui.theme.WgraceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        Text(
            text = "Welcome to Android",
            color = Color.Red,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
        Text(text = "TRAVEL WITH US!",
            fontWeight = FontWeight.Bold)
        Text(
            text = "eMobilis Mobile Training Institute",
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold)


        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
            },
            shape = RoundedCornerShape(4.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.align(Alignment.CenterHorizontally)

        ) {
            Text(text = "Destination")
        }

    Text(
        text = "Nairobi Kenya tourist attractions",
        fontSize = 10.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.run {
            fillMaxWidth()
                .background(Color.Black)
                .height(20.dp)
        },
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline
    )

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Button(
                onClick = {mContext.startActivity(Intent(mContext,ExploreActivity::class.java)) }
            ){
               Text(text = "Explore")
            }
        }
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Button(
                onClick = {mContext.startActivity(Intent(mContext,LottieActivity::class.java)) }
            ){
                Text(text = "Anime")
            }
        }
Text(text = "Travel the World")
    //Centering an image
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.elephant),
            contentDescription = "car",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop)
    }


    Button(
        onClick = { mContext.startActivity(Intent(mContext,LayoutActivity::class.java)) },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)

    ) {
        Text(text = "Continue")
    }

}
}










@Preview(showBackground = true)
@Composable
fun DemoPreview() {
    Demo()
}
