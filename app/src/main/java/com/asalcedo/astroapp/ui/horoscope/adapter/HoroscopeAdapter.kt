package com.asalcedo.astroapp.ui.horoscope.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.asalcedo.astroapp.domain.model.HoroscopeInfo

/****
 * Project: AstroApp
 * From: com.asalcedo.astroapp.ui.horoscope.adapter
 * Created by Alex Salcedo Silva on 25/9/23 at 20:22
 * All rights reserve 2022.
 ***/
class HoroscopeAdapter(private var horoscopeList: List<HoroscopeInfo>) :
    Adapter<HoroscopeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}