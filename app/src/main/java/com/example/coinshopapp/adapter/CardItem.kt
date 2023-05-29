package com.example.coinshopapp.adapter

import android.graphics.Bitmap

data class CardItem(val cardImg: Bitmap,
                    val cardtext:String,
                    val bottomText:String,
                    val bottomImage: Bitmap?= null,
                    val fistToppingText: String?= null,
                    val SecondToppingText: String?= null,

                    val backgroundColor: Int? = null,
                    val textColor:Int? = null,
                    val cardColod:Int?=null
                    )
