package com.asalcedo.astroapp.data.network.response

import com.asalcedo.astroapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test

class PredictionResponseTest {
    @Test
    fun `toDomain should return a correct PredictionModel`() {
        //GIVEN
        val horoscopeResponse = HoroscopeMotherObject.anyResponse

        //WHEN
        val predictionModel = horoscopeResponse.toDomain()

        //THEN
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}