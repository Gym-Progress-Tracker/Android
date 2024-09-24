package br.com.rafaseron.blankapp.ui.components

import androidx.compose.foundation.layout.offset
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rafaseron.blankapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlankAppTopAppBar(onArrowBackClick: () -> Unit = {}) {
    TopAppBar(
        title = { Text(text = "Voltar", modifier = Modifier.offset(x = 120.dp)) },
        navigationIcon = {
            IconButton(onClick = { onArrowBackClick() }) {
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_24), contentDescription = null)
            }
        }
    )
}

@Preview
@Composable
private fun BlankAppTopAppBarPreview() {
    BlankAppTopAppBar()
}