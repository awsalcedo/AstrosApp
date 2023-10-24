package com.asalcedo.astroapp.data

import android.util.Log
import com.asalcedo.astroapp.data.network.HoroscopeApiService
import com.asalcedo.astroapp.domain.Repository
import com.asalcedo.astroapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        /*
        Run the block of code and catch any exceptions without interrupting the flow of the program
         */
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("AstroApp", "An error has ocurred: ${it.message} ") }
        return null
    }
}