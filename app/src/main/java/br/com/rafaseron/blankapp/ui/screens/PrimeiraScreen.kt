package br.com.rafaseron.blankapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rafaseron.blankapp.ui.viewmodels.PrimeiraUiState

@Composable
fun PrimeiraScreen(uiState: PrimeiraUiState) {

    Column(modifier = Modifier.fillMaxSize(1f)) {
        Box(modifier = Modifier.padding(start = 70.dp, top = 300.dp)) {
            Text(text = "Primeira Tela",
                fontSize = 40.sp)
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun PrimeiraScreenPreview() {
    PrimeiraScreen(uiState = PrimeiraUiState())
}