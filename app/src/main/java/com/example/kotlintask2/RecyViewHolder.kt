package com.example.kotlintask2
import android.view.View
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_list_item.view.*

class RecyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(item: RecyItem) {
        itemView.textview.text =item.key
        itemView.textview2.text =item.value
    }

    }
