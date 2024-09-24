package br.com.rafaseron.blankapp.navigation

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import br.com.rafaseron.blankapp.navigation.navHost.routeB
import br.com.rafaseron.blankapp.ui.screens.SegundaScreen
import br.com.rafaseron.blankapp.ui.viewmodels.SegundaViewModel

fun NavGraphBuilder.segundaScreenNavigation(){

    composable(route = routeB){
        val viewModel: SegundaViewModel = hiltViewModel()
        val uiState by viewModel.uiState.collectAsState()

        SegundaScreen(uiState = uiState)
    }

}

fun NavHostController.navigateToRouteB(){
    navigate(routeB){
        popUpTo(route = routeB)
        launchSingleTop = true
    }
}