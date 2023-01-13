package com.example.composearticleexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticleexercise.ui.theme.ComposeArticleExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticle(
                        title = stringResource(id = R.string.article_title),
                        description = stringResource(id = R.string.compose_description),
                        body = stringResource(id = R.string.article_body)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ComposeArticle(title: String, description: String, body: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(
            painter = image,
            contentDescription = "Header image depicting various tools" +
                    " relevant to Android development.",
            modifier = Modifier
                .fillMaxWidth()
            )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
            )
        Text(
            text = body,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleExerciseTheme {
        ComposeArticle(
            title = stringResource(R.string.article_title),
            description = stringResource(R.string.compose_description),
            body = stringResource(R.string.article_body)
            )
    }
}