package com.example.wgraceapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wgraceapp.ui.theme.WgraceAppTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          MyForm()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyForm(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(title = { Text(text = "Form", color = Color.White)},
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
                IconButton(onClick = { mContext.startActivity(Intent(mContext,ExploreActivity::class.java)) }) {
                    Icon(imageVector = Icons.Default.ArrowForward,
                        contentDescription ="settings",
                        tint = Color.White)
                }
            }
        )
        //End of TopAppbar



        var firstname by remember { mutableStateOf("")}
        var lastname by remember { mutableStateOf("")}
        var email by remember { mutableStateOf("")}
        var password by remember { mutableStateOf("")}
        var contact by remember { mutableStateOf("")}

       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center){
           Image(painter = painterResource(id = R.drawable.reg),
               contentDescription = "Register",
               modifier = Modifier.size(90.dp)
           )

       }
        Text(text = "CREATE AN ACCOUNT",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(5.dp))
        //FIRSTNAME
        TextField(
            value = firstname,
            onValueChange = {firstname = it},
            placeholder = { Text(text = "Firstname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Icon For Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        Spacer(modifier = Modifier.height(5.dp))
        //LASTNAME
        TextField(
            value = lastname,
            onValueChange = {lastname = it},
            placeholder = { Text(text = "Lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Icon For Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        Spacer(modifier = Modifier.height(5.dp))
        //EMAIL
        TextField(
            value = email,
            onValueChange = {email = it},
            placeholder = { Text(text = "EmailAddress")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Icon For Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        Spacer(modifier = Modifier.height(5.dp))
        //PASSWORD
        TextField(
            value = password,
            onValueChange = {password = it},
            placeholder = { Text(text = "Password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Icon For Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(5.dp))
        //CONTACT
        TextField(
            value = contact,
            onValueChange = {contact = it},
            placeholder = { Text(text = "Phone Number")},
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "Icon for Call")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

        )
        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        ) {
            Text(text = "CREATE")
        }
        Text(
            text = "Already have account? Log in",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                },
            textAlign = TextAlign.Center
        )


    }

}

@Preview(showBackground = true)
@Composable
fun MyFormPreview(){
    MyForm()
}