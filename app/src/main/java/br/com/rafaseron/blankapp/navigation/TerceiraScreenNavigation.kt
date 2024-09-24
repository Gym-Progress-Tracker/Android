package br.com.rafaseron.blankapp.navigation

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import br.com.rafaseron.blankapp.navigation.navHost.routeC
import br.com.rafaseron.blankapp.ui.screens.TerceiraScreen
import br.com.rafaseron.blankapp.ui.viewmodels.TerceiraViewModel

fun NavGraphBuilder.terceiraScreenNavigation(){

    composable(route = routeC){
        val viewModel: TerceiraViewModel = hiltViewModel()
        val uiState by viewModel.uiState.collectAsState()

        TerceiraScreen(uiState = uiState)
    }

}

fun NavHostController.navigateToRouteC(){
    navigate(routeC){
        popUpTo(route = routeC)
        launchSingleTop = true
    }
}