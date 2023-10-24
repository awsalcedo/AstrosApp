package com.asalcedo.astroapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asalcedo.astroapp.domain.usecase.GetPredictionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val useCase: GetPredictionUseCase) :
    ViewModel() {
    private var _state =
        MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading) // initial state
    val state: StateFlow<HoroscopeDetailState> = _state

    fun getHoroscope(sing: String) {
        /*
        To paint the UI it must be done from the main thread,
        when using only launch by default it is assumed that it goes through the main thread and internet requests
        must always be made from another thread, that is why withContext is used
         */
        viewModelScope.launch {
            _state.value = HoroscopeDetailState.Loading
            val result = withContext(Dispatchers.IO) { useCase(sing) }
            if (result != null) {
                _state.value = HoroscopeDetailState.Success(result.horoscope, result.sign)
            } else {
                _state.value = HoroscopeDetailState.Error("An error ocurred, try again later !!!")
            }
        }
    }
}