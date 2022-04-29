package com.example.architecturedemo.ui.university

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.architecturedemo.R
import com.example.architecturedemo.databinding.FragmentUniversityBinding
import com.example.architecturedemo.ui.utils.base.RVModelBindingAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UniversityFragment: Fragment() {

    private val viewModel: UniversityViewModel by viewModels()
    private lateinit var binding: FragmentUniversityBinding

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            requireActivity(),
            R.layout.fragment_university
        )
        binding = FragmentUniversityBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        binding.rvUniversityList.adapter = RVModelBindingAdapter(
            emptyList(),
            viewModel,
            UniversityVHFactory()
        )
    }*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.setContentView(
            requireActivity(),
            R.layout.fragment_university
        )
        binding = FragmentUniversityBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        binding.rvUniversityList.adapter = RVModelBindingAdapter(
            emptyList(),
            viewModel,
            UniversityVHFactory()
        )
        return binding.root
    }
}