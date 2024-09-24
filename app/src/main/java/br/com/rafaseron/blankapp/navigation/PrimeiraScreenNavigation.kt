package br.com.rafaseron.blankapp.navigation

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import br.com.rafaseron.blankapp.navigation.navHost.routeA
import br.com.rafaseron.blankapp.ui.screens.PrimeiraScreen
import br.com.rafaseron.blankapp.ui.viewmodels.PrimeiraViewModel

fun NavGraphBuilder.primeiraScreenNavigation() {

    composable(route = routeA){
        val viewModel: PrimeiraViewModel = hiltViewModel()
        val uiState by viewModel.uiState.collectAsState()

        PrimeiraScreen(uiState = uiState)
    }

}

fun NavHostController.navigateToRouteA(){
    navigate(routeA){
        popUpTo(route = routeA)
        launchSingleTop = true
    }
}