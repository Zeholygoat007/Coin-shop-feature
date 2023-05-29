package com.example.coinshopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toBitmap
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coinshopapp.adapter.CardAdapter
import com.example.coinshopapp.adapter.CardItem

class SecondActivity : AppCompatActivity() {
    lateinit var rv_balance : RecyclerView
    lateinit var cards_balance : ArrayList<CardItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initCard_coins()
        rv_balance = findViewById(R.id.recyclerView_balence)
        val adapter = CardAdapter(cards_balance)

        val layoutManager3 = GridLayoutManager(this, 3)
        rv_balance.layoutManager = layoutManager3
        rv_balance.adapter = adapter

    }
    private fun initCard_coins() {
        cards_balance = ArrayList()
        cards_balance.add(
            CardItem(
                resources.getDrawable(R.drawable.coinicon, null).toBitmap(),
                "x5", "RM6.95", null,  backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f),
                cardColod = resources.getColor(R.color.light_gold)
            )
        )

        cards_balance.add(
            CardItem(
                resources.getDrawable(R.drawable.twocoins, null).toBitmap(),
                "x300",
                "RM6.95",
                null,  backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f),
                cardColod = resources.getColor(R.color.light_gold)
            )
        )

        cards_balance.add(
            CardItem(
                resources.getDrawable(R.drawable.coinstree, null).toBitmap(),
                "x300",
                "RM6.95", backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f),
                cardColod = resources.getColor(R.color.light_gold)
            )
        )

        cards_balance.add(
            CardItem(
                resources.getDrawable(R.drawable.coinsfour, null).toBitmap(),
                "x5", "RM6.95", backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f),
                cardColod = resources.getColor(R.color.light_gold)
            )
        )

        cards_balance.add(
            CardItem(
                resources.getDrawable(R.drawable.coinsfive, null).toBitmap(),
                "x300",
                "RM6.95", backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f),
                cardColod = resources.getColor(R.color.light_gold)
            )
        )

        cards_balance.add(
            CardItem(
                resources.getDrawable(R.drawable.coinssix, null).toBitmap(),
                "x300",
                "RM6.95",  backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f),
                cardColod = resources.getColor(R.color.light_gold)
            )
        )
    }

}