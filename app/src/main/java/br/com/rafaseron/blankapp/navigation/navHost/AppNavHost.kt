package br.com.rafaseron.blankapp.navigation.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import br.com.rafaseron.blankapp.navigation.primeiraScreenNavigation
import br.com.rafaseron.blankapp.navigation.segundaScreenNavigation
import br.com.rafaseron.blankapp.navigation.terceiraScreenNavigation

const val routeA: String = "routeA"
const val routeB: String = "routeB"
const val routeC: String = "routeC"
@Composable
fun NavHostComposable(navController: NavHostController) {
    NavHost(navController = navController, startDestination = routeA){

        primeiraScreenNavigation()
        segundaScreenNavigation()
        terceiraScreenNavigation()

    }
}