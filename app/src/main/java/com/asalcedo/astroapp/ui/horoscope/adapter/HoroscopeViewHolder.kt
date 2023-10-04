package com.asalcedo.astroapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.asalcedo.astroapp.databinding.ItemHoroscopeBinding
import com.asalcedo.astroapp.domain.model.HoroscopeInfo

/****
 * Project: AstroApp
 * From: com.asalcedo.astroapp.ui.horoscope.adapter
 * Created by Alex Salcedo Silva on 25/9/23 at 20:22
 * All rights reserve 2022.
 ***/
class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener { onItemSelected(horoscopeInfo) }
    }
}