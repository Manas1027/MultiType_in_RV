package com.example.multitype_in_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.multitype_in_rv.model.Ad
import com.example.multitype_in_rv.model.Model
import com.example.multitype_in_rv.model.Post
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RV.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        RV.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL))
        RV.adapter = adapter
        SetData()
    }




        fun SetData(){
            var params: MutableList<Model> = mutableListOf()
            for(i in 1..100){
                if(i%5==0){
                    var reklama = Ad(Model.AD_TYPE, "")
                    params.add(reklama)
                }
                else {
                    var posts = Post(Model.POST_TYPE, "Title $i", "Description $i")
                    params.add(posts)
                }
            }
            adapter.models = params
        }
}