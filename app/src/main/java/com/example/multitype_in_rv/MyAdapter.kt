package com.example.multitype_in_rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multitype_in_rv.model.Ad
import com.example.multitype_in_rv.model.Model
import com.example.multitype_in_rv.model.Post
import java.lang.AssertionError

class MyAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var models: MutableList<Model> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return models[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view: View
        if(viewType == 1) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
            return PostViewHolder(view)
        }
        else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_ad, parent, false)
            return AdViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(getItemViewType(position) == 1)
            (holder as PostViewHolder).populateModel(models[position] as Post)
        else
            (holder as AdViewHolder).populateModel(models[position] as Ad)
    }

    override fun getItemCount(): Int {
        return models.size
    }
}