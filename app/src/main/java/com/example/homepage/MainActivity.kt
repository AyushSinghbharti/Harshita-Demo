package com.example.homepage

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homepage.ui.theme.HomePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HomePageUi( )
        }
    }
}

@Composable

fun HomePageUi(){
    val scrollState = rememberScrollState()

    val logo1: Painter = painterResource(id = R.drawable.coffeecuplogo)
    val logo2: Painter = painterResource(id = R.drawable.eaglelogo)
    val logo3: Painter = painterResource(id = R.drawable.handlogo)
    val poster1: Painter = painterResource(id = R.drawable.indianposter)
    val poster2: Painter = painterResource(id = R.drawable.ladyposter)
    val poster3: Painter = painterResource(id = R.drawable.poster)
    val poster4: Painter = painterResource(id = R.drawable.tajmahalposter)

    Column(modifier = Modifier
            .scrollable(state = scrollState, orientation = Orientation.Vertical)){
        Card() {
            Column() {

            Image(painter = logo1,contentDescription = "logo1", modifier = Modifier.padding(10.dp))
                Spacer(modifier = Modifier.padding(10.dp))
            Row() {
                Text(
                    text = "NAME"
                )
                Text(text = "CAPTION")
            }
            }
        }

            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

        Card() {
            Column() {

                Image(painter = logo2,contentDescription = "logo2", modifier = Modifier.padding(10.dp))
                Spacer(modifier = Modifier.padding(10.dp))
                Row() {
                    Text(
                        text = "NAME"
                    )
                    Text(text = "CAPTION")
                }
            }
        }

        Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

        Card () {
            Column() {
                Image(painter = logo3, contentDescription = "logo3", Modifier.padding(10.dp))
                Spacer(modifier = Modifier.padding(10.dp))

                Row() {
                    Text(
                        text = "NAME"
                    )
                    Text(text = "CAPTION")
                }
            }
        }
        Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

        Card () {
            Column() {
                Image(painter = poster1, contentDescription = "poster1", Modifier.padding(10.dp))
                Spacer(modifier = Modifier.padding(10.dp))

                Row() {
                    Text(
                        text = "NAME"
                    )
                    Text(text = "CAPTION")
                }
            }
        }
        Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))








        }
    }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomePageUi()
    }