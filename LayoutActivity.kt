package com.example.wgraceapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.wgraceapp.ui.theme.WgraceAppTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(title = { Text(text = "Layout", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Magenta),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                })
                {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription ="back",
                        tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share ,
                        contentDescription ="share",
                        tint = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings ,
                        contentDescription ="settings",
                        tint = Color.White)
                }


            }

            )
        //End of TopAppbar

        Text(
            text = "TYPES OF CARS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        //Row1
        Row {
            Image(painter = painterResource(id = R.drawable.bmw) ,
                contentDescription = "BMW",
                modifier = Modifier.size(width = 200.dp, height = 200.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "BMW",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "Bayerische Motoren Werke AG, commonly abbreviated to BMW, is a German multinational manufacturer of luxury vehicles and motorcycles headquartered in Munich, Bavaria, Germany.",
                    )
            }
        }
        //End of row 1
        Spacer(modifier = Modifier.height(5.dp))

        //Row2
        Row {
            Image(painter = painterResource(id = R.drawable.lam) ,
                contentDescription = "lam",
                modifier = Modifier.size(width = 200.dp, height = 200.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "Lamborghini",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "Bayerische Motoren Werke AG, commonly abbreviated to BMW, is a German multinational manufacturer of luxury vehicles and motorcycles headquartered in Munich, Bavaria, Germany.",
                )
            }
        }
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,IntentActivity::class.java))
                      },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            androidx.compose.material3.Text(text = "Next")
        }





    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}