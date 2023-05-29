package com.example.coinshopapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coinshopapp.R

class CardAdapter(val data:  ArrayList<CardItem>): RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data.get(position)
        holder.cardImg.setImageBitmap(item.cardImg)
        holder.imgText.text  = item.cardtext
        holder.bottomText.text = item.bottomText
        if(item.bottomImage!= null){
            holder.bottomImage.setImageBitmap(item.bottomImage)
        }else{
            holder.bottomImage.visibility = View.GONE
        }
        if(item.fistToppingText!= null){
            holder.firstTopping.text =  item.fistToppingText
        }else{
            holder.firstTopping.visibility = View.GONE
        }
        if(item.SecondToppingText!= null){
            holder.SecondTopping.text =  item.SecondToppingText
        }else{
            holder.SecondTopping.visibility = View.GONE }
        if(item.backgroundColor!= null && item.textColor!=null){
            holder.bottomSection.setBackgroundColor(item.backgroundColor)
            holder.imgText.setTextColor(item.textColor)
        }
        if(item.cardColod!= null){
            holder.parentLayout.setBackgroundColor(item.cardColod)
        }




    }


    class ViewHolder(item: View) : RecyclerView.ViewHolder(item){
        val cardImg = item.findViewById<ImageView>(R.id.icon_image)
        val imgText = item.findViewById<TextView>(R.id.icon_text)
        val bottomText = item.findViewById<TextView>(R.id.bottomText)
        val bottomImage = item.findViewById<ImageView>(R.id.bottom_img)
        val firstTopping = item.findViewById<TextView>(R.id.purple_topping)
        val SecondTopping = item.findViewById<TextView>(R.id.green_topping)
        val bottomSection = item.findViewById<RelativeLayout>(R.id.bottom_section)
        val parentLayout = item.findViewById<LinearLayout>(R.id.parent_layout)
    }


}