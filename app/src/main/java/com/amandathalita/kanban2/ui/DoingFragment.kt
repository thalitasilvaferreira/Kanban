package com.amandathalita.kanban2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amandathalita.kanban2.R
import com.amandathalita.kanban2.databinding.FragmentDoingBinding
import com.amandathalita.kanban2.databinding.FragmentHomeBinding

class DoingFragment : Fragment() {
    private var _binding: FragmentDoingBinding? = null
    private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDoingBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}