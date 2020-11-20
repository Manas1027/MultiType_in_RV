package com.example.multitype_in_rv.model

open class Model(var type: Int){
    companion object{
        const val POST_TYPE = 1
        const val AD_TYPE = 2
    }
}