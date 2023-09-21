package com.asalcedo.astroapp.ui.palmistry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.asalcedo.astroapp.databinding.FragmentPalMistryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PalMistryFragment : Fragment() {

    private var _binding: FragmentPalMistryBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalMistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}