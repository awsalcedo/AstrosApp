package com.asalcedo.astroapp.domain

import com.asalcedo.astroapp.domain.model.PredictionModel

/*
It allows communication between model layer and data layer
 */
interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}