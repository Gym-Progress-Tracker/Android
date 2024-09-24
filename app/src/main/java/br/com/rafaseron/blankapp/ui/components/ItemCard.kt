package br.com.rafaseron.blankapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rafaseron.blankapp.R

@Composable
fun ItemCard() {

    Box(modifier = Modifier
        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(8.dp))
        .padding(15.dp)) {

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {

            Image(painter = painterResource(id = R.drawable.image_acaipanda),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .size(70.dp))

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(text = "Açaí Panda", modifier = Modifier,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(text = "O melhor açaí da cidade")
            }
        }

    }
}

@Preview (showBackground = true)
@Composable
private fun ItemCardPreview() {
    ItemCard()
}