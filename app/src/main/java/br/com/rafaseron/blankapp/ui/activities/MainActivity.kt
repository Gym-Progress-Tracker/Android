package br.com.rafaseron.blankapp.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.rafaseron.blankapp.navigation.navHost.NavHostComposable
import br.com.rafaseron.blankapp.navigation.navHost.routeA
import br.com.rafaseron.blankapp.navigation.navHost.routeB
import br.com.rafaseron.blankapp.navigation.navHost.routeC
import br.com.rafaseron.blankapp.navigation.navigateToRouteA
import br.com.rafaseron.blankapp.navigation.navigateToRouteB
import br.com.rafaseron.blankapp.navigation.navigateToRouteC
import br.com.rafaseron.blankapp.ui.components.BlankAppNavigationBar
import br.com.rafaseron.blankapp.ui.components.BlankAppTopAppBar
import br.com.rafaseron.blankapp.ui.components.BottomAppBarItem
import br.com.rafaseron.blankapp.ui.components.bottomAppBarList
import br.com.rafaseron.blankapp.ui.theme.BlankAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            var currentScreen by remember {
                mutableStateOf(routeA)
            }

            val navController: NavHostController = rememberNavController()

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            navBackStackEntry?.destination?.route.let {
                if(it!=null){
                    currentScreen = it
                }
            }

            fun bottomAppBarItemClick(bottomAppBarItem: BottomAppBarItem){
                when (bottomAppBarItem.route){
                    routeA -> {
                        navController.navigateToRouteA()
                        currentScreen = routeA
                    }
                    routeB -> {
                        navController.navigateToRouteB()
                        currentScreen = routeB
                    }
                    routeC -> {
                        navController.navigateToRouteC()
                        currentScreen = routeC
                    }
                    else -> {
                        navController.navigateToRouteA()
                        currentScreen = routeA
                    }
                }
            }

            BlankAppTheme {
                Surface {
                    ComposableMaster(navController = navController, selectedScreen = {
                        bottomAppBarItem ->
                        bottomAppBarItemClick(bottomAppBarItem)
                    }, atualScreen = currentScreen)
                }
            }
        }
    }
}

@Composable
fun ComposableMasterContent(paddingValues: PaddingValues, navController: NavHostController) {
    Box(modifier = Modifier.padding(paddingValues)){
        NavHostComposable(navController = navController)
    }
}

@Composable
fun ComposableMaster(navController: NavHostController, selectedScreen: (bottomAppBarItem: BottomAppBarItem) -> Unit = {}, atualScreen: String) {
    Scaffold(topBar = {
        val showTopAppBar = when(atualScreen){
            routeA -> true
            routeB -> false
            routeC -> true
            else -> false
        }

        if(showTopAppBar){
            BlankAppTopAppBar(onArrowBackClick = {navController.navigateUp()})
        }
                      },
        bottomBar = {
            val showNavigationBar = when(atualScreen){
                routeA, routeB, routeC -> true
                else -> false
            }

            if(showNavigationBar){
                BlankAppNavigationBar(selected = atualScreen, bottomBarList = bottomAppBarList, onItemClick = {
                        bottomAppBarItem ->
                    selectedScreen(bottomAppBarItem)
                })
            }
    }) {
        paddingValues ->
        ComposableMasterContent(paddingValues = paddingValues, navController = navController)
    }
}