package com.example.composeprogrammingsimplefied.recyclerView

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeprogrammingsimplefied.Greeting
import com.example.composeprogrammingsimplefied.R

@Composable
fun Screen() {
    Recyclerview(users = dummyData())
}

@Composable
fun EachRow(user:User) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(CornerSize(10.dp)),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(modifier = Modifier.padding(5.dp)) {
            Image(
                painter = painterResource(id = R.drawable.spiderman),
                contentDescription = "image",
                modifier = Modifier
                    .padding(8.dp)
                    .size(80.dp)
                    .align(Alignment.CenterVertically)
                    .clip(RoundedCornerShape(CornerSize(10.dp)))
            )
            Text(text = user.description,modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun Recyclerview(users:List<User>){
    LazyColumn{
        items(users) {
            EachRow(user = it)
        }
    }
}

@Preview(
    showBackground = true,
    name = "preview"/*,
    widthDp = 200,
    heightDp = 200*/
)
@Composable
fun ShowPreview() {
    Screen()
}