package com.asalcedo.astroapp.ui.horoscope

import com.asalcedo.astroapp.data.providers.HoroscopeProvider
import com.asalcedo.astroapp.motherobject.HoroscopeMotherObject
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest {

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider
    private lateinit var viewModel: HoroscopeViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewmodel is created then horoscope are loaded`() {
        every { horoscopeProvider.getHoroscopes() } returns HoroscopeMotherObject.horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }
}