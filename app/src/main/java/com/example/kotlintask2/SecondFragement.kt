package com.example.kotlintask2

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragement : Fragment() {

    companion object {
        fun newInstance() = SecondFragement()
    }

    private lateinit var viewModel: SecondFragementViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_fragement_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view?.let { super.onViewCreated(it, savedInstanceState) }
        with(recycler) {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = RecyclerView(populate())

        }
    }

          fun populate(): List<RecyItem>{
            return listOf(
                RecyItem("Item 1", getString(R.string.Milo)),
                RecyItem("Item 2", getString(R.string.Item_2_Golden_Morn)),
                RecyItem("Item 3", getString(R.string.Item_3_Soap)),
                RecyItem("Item 4", getString(R.string.Item_4_Soda)),
                RecyItem("Item 5", getString(R.string.Item_5_Rice)),
                RecyItem("Item 6", getString(R.string.Item_6_Chicken)),
                RecyItem("Item 7", getString(R.string.Item_7_Toilet_Roll)),
                RecyItem("Item 8", getString(R.string.Item_8_Biscuit))
            )

          }

          }






