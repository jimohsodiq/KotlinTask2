package com.example.kotlintask2
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerView(private val items: List<RecyItem>):RecyclerView.Adapter<RecyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder {
        return RecyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_item, parent, false))

    }

    override fun getItemCount(): Int = items.size



    override fun onBindViewHolder(holder: RecyViewHolder, position: Int) = holder.bind(items[position])

    }
