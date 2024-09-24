package br.com.rafaseron.blankapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import br.com.rafaseron.blankapp.data.repository.ModelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class SegundaUiState(val texto: String = "")

@HiltViewModel
class SegundaViewModel @Inject constructor(private val modelRepository: ModelRepository): ViewModel(){
    private val _uiState = MutableStateFlow(SegundaUiState())
    val uiState = _uiState.asStateFlow()

    fun mudarTexto(newValue: String){
        _uiState.value = _uiState.value.copy(texto = newValue)
    }
}