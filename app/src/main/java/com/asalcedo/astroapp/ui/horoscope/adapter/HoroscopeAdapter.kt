package com.asalcedo.astroapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asalcedo.astroapp.R
import com.asalcedo.astroapp.domain.model.HoroscopeInfo

/****
 * Project: AstroApp
 * From: com.asalcedo.astroapp.ui.horoscope.adapter
 * Created by Alex Salcedo Silva on 25/9/23 at 20:22
 * All rights reserve 2022.
 ***/
class HoroscopeAdapter(private var horoscopeList: List<HoroscopeInfo> = emptyList()) :
    RecyclerView.Adapter<HoroscopeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        )
    }

    override fun getItemCount() = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position])
    }
}