package com.example.multitype_in_rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.multitype_in_rv.model.Post
import kotlinx.android.synthetic.main.item.view.*

class PostViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView){

    fun populateModel(data: Post){
        itemView.firstname.text = data.title
        itemView.lastname.text = data.descripton
    }
}