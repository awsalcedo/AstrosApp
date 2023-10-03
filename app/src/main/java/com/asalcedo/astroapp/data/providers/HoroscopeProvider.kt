package com.asalcedo.astroapp.data.providers

import com.asalcedo.astroapp.domain.model.HoroscopeInfo
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Aquarius
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Aries
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Cancer
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Capricorn
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Gemninis
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Leo
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Libra
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Pisces
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Sagittarius
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Scorpio
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Taurus
import com.asalcedo.astroapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

/****
 * Project: AstroApp
 * From: com.asalcedo.astroapp.data.providers
 * Created by Alex Salcedo Silva on 2/10/23 at 21:43
 * All rights reserve 2022.
 ***/
class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemninis,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}