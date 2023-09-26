package com.asalcedo.astroapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.asalcedo.astroapp.domain.model.HoroscopeInfo
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Aries
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Gemninis
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Libra
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Taurus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() : ViewModel() {

    private var _horosCope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horosCope

    init {
        _horosCope.value = listOf(
            Aries, Taurus, Libra, Gemninis
        )
    }

}