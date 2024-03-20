package com.example.wgraceapp

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Column(modifier = Modifier.fillMaxSize
        ()) {
        Text(
            text = "Welcome to Android",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Android software development is the process by which applications are created for devices running the Android operating system. Google states that \"Android apps can be written using Kotlin, Java, and C++ languages\" using the Android software development kit, while using other languages is also possible.")

        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.align(Alignment.CenterHorizontally)




        ) {
            Text(text = "See more")
        }


    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Types of cars",
        fontSize = 20.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.run {
            fillMaxWidth()
                .background(Color.Red)
                .height(40.dp)
        },
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline
    )
    Text(text = "1.BMW")
    Text(text = "2.Mercedes Benz")
    Text(text = "3.Ferrari")
    Text(text = "4.Bugatti")
    Spacer(modifier = Modifier.height(20.dp))
    //Centering an image
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.bmw),
            contentDescription = "car",
            modifier = Modifier.size(200.dp))
    }

    Text(text = "BEST CAR COMPANIES IN KENYA",
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.run {
            fillMaxWidth()
                .background(Color.Blue)
                .height(40.dp)
        })
    Text(text = "1.A-PLUS MOTORS LTD. AUTOBATT GROUP LIMITED")
    Text(text = "2.Amex Autoparts. Associated Vehicle Assemblers Limited")
    Text(text = "3.August Auto Agencies Ltd. Auto Springs East Africa (PLC)")
    Text(text = "4.Autochek Kenya. Autofine Limited")
    Text(text = "etc.")
    Divider()
    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "eMobilis Mobile Training Institute",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(20.dp))

    Button(
        onClick = { /*TODO*/ },
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
