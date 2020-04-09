package com.example.kotlintask2

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SecondFrag : Fragment() {

    companion object {
        fun newInstance() = SecondFrag()
    }

    private lateinit var viewModel: SecondViewModel2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter: RecyclerView



        viewModel = ViewModelProviders.of(this).get(SecondViewModel2::class.java)
        // TODO: Use the ViewModel
    }

}
