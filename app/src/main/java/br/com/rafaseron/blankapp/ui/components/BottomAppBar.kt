package br.com.rafaseron.blankapp.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.rafaseron.blankapp.R
import br.com.rafaseron.blankapp.navigation.navHost.routeA
import br.com.rafaseron.blankapp.navigation.navHost.routeB
import br.com.rafaseron.blankapp.navigation.navHost.routeC

data class BottomAppBarItem(val label: String, val iconNonFilled: Int, val iconFilled: Int, val route: String)

val bottomAppBarList: List<BottomAppBarItem> = listOf(
    BottomAppBarItem(label = "Primeira Tela", iconNonFilled = R.drawable.home_non_filled, iconFilled = R.drawable.home_filled, route = routeA),
    BottomAppBarItem(label = "Segunda Tela", iconNonFilled = R.drawable.cart_non_filled, iconFilled = R.drawable.cart_filled, route = routeB),
    BottomAppBarItem(label = "Terceira Tela", iconNonFilled = R.drawable.order_non_filled, iconFilled = R.drawable.order_filled, route = routeC),
)

@Composable
fun BlankAppNavigationBar(selected: String, onItemClick: (BottomAppBarItem) -> Unit = {},
                          bottomBarList: List<BottomAppBarItem>) {
    NavigationBar {
        for (item in bottomBarList){

            var latestIcon = item.iconNonFilled
            if(selected == item.route){
                latestIcon = item.iconFilled
            }

            NavigationBarItem(
                label = { Text(text = item.label) },
                icon = { Icon(painter = painterResource(id = latestIcon), contentDescription = item.label) },
                selected = item.route==selected, onClick = { onItemClick(item) } )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun BottomAppBarPreview() {
    BlankAppNavigationBar(selected = "A", onItemClick = {}, bottomBarList = bottomAppBarList)
}