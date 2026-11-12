package com.amandathalita.kanban2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amandathalita.kanban2.R
import com.amandathalita.kanban2.databinding.FragmentHomeBinding
import com.amandathalita.kanban2.databinding.FragmentTodoBinding

class TodoFragment : Fragment() {
    private var _binding: FragmentTodoBinding? = null
    private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTodoBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}