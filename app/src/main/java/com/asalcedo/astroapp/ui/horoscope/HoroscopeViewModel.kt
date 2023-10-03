package com.asalcedo.astroapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.asalcedo.astroapp.data.providers.HoroscopeProvider
import com.asalcedo.astroapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider) :
    ViewModel() {

    private var _horosCope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horosCope

    init {
        _horosCope.value = horoscopeProvider.getHoroscopes()
    }

}