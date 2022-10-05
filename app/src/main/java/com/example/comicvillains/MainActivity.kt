package com.example.comicvillains

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.comicvillains.ui.theme.ComicVillainsTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import com.example.comicvillains.data.Datasource
import com.example.comicvillains.module.villains

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                villainsApp()
            }
        }
    }
@Composable
fun villainsApp()
{
    ComicVillainsTheme{
        villainsList(villainslist = Datasource().loadVillains())
    }
}
@Composable
private fun villainsList(villainslist: List<villains>,modifier:Modifier=Modifier) {
    LazyColumn {
        items(villainslist) { villains->
            villainCard(villains=villains)
        }
    }
}
@Composable
fun villainCard(villains:villains){
    Card(
        modifier= Modifier
            .padding(4.dp),
        elevation=8.dp
    ) {
        Row() {
            Image(
                painter = painterResource(id = villains.imageResourceId),
                contentDescription= stringResource(id = villains.stringResourceId1),
                modifier= Modifier
                    .fillMaxWidth(0.3f)
                    .height(180.dp),
                contentScale= ContentScale.Crop
            )
            Column()
            {
                Text(
                    text=stringResource(id=villains.stringResourceId1),
                    modifier=Modifier
                        .padding(12.dp),
                    style= MaterialTheme.typography.h6,
                    fontSize=22.sp
                )
                Text(
                    text=stringResource(id=villains.stringResourceId2),
                    modifier=Modifier
                        .padding(10.dp)
                        .alpha(0.8f),
                    style= MaterialTheme.typography.h6,
                    fontSize=12.sp,
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComicVillainsTheme {
        villainCard(villains=villains(R.string.villain1_name,R.string.thanos,R.drawable.villains1))

    }
}