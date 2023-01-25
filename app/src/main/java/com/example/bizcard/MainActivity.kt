package com.example.bizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bizcard.ui.theme.BizcardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BizcardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
   Surface(
    color = Color(0xff083041),
       modifier = Modifier.fillMaxSize(),
   ) {

       Column(
           verticalArrangement =  Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Spacer(  modifier = Modifier.weight(1f))
           Column(
               verticalArrangement =  Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,

           ) {

               Image(painter = painterResource(id = R.drawable.android_logo, ), modifier = Modifier.width(100.dp),  contentDescription = "")

               Text("Jennifer Doe", style = TextStyle(fontSize = 30.sp, color = Color.White, letterSpacing = 2.sp))
               Text("Android Developer Extraordinaire", style = TextStyle(fontSize = 15.sp, color = Color.Green))




           }

Spacer(  modifier = Modifier.weight(1f))

           Column(
               modifier = Modifier.padding(vertical =   40.dp)
           ) {
               Divider(
                   color = Color.Gray
               )
               RowWidget(
                   text= "+111-2343-344",
                   icon= Icons.Default.Phone

               )
               Divider(
                   color = Color.Gray
               )
               RowWidget(
                   text= "@AndroidDev",
                   icon= Icons.Default.Share

               )
               Divider(
                   color = Color.Gray
               )
               RowWidget(
                   text= "michael@gmail.com",
                   icon= Icons.Default.Email

               )
           }

       }
       }








}


@Composable
fun RowWidget(
    text: String,
    icon:ImageVector

) {
    Row(
        modifier = Modifier.padding(vertical = 10.dp)
    ) {
        Icon(imageVector = icon, contentDescription = "", tint = Color.Green, modifier = Modifier.padding(horizontal = 15.dp,))
        Text(text = text, style = TextStyle(color = Color.White))
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BizcardTheme {
        Greeting()
    }
}