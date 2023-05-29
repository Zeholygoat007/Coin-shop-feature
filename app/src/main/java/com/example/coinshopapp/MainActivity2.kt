package com.example.coinshopapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toBitmap
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coinshopapp.adapter.CardAdapter
import com.example.coinshopapp.adapter.CardItem

class MainActivity2 : AppCompatActivity() {
    lateinit var rv_supercinta : RecyclerView
    lateinit var rv_receipts : RecyclerView
    lateinit var rv_coins : RecyclerView

    lateinit var cards : ArrayList<CardItem>
    lateinit var cards_receipts : ArrayList<CardItem>
    lateinit var cards_coins : ArrayList<CardItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initCards()
        initCard_receits()
    initCard_coins()



        val adapter = CardAdapter(cards)
        val adapter_receits = CardAdapter(cards_receipts)
        val adapter_coins = CardAdapter(cards_coins)

        rv_supercinta= findViewById(R.id.recyclerView_superCinta)
        rv_receipts= findViewById(R.id.rv_receipts)
        rv_coins = findViewById(R.id.rv_coins_packages)


        rv_receipts.adapter = adapter_receits
        rv_supercinta.adapter  = adapter
        rv_coins.adapter = adapter_coins


        val layoutManager = GridLayoutManager(this, 3)
        rv_supercinta.layoutManager = layoutManager

        val layoutManager2 = GridLayoutManager(this, 3)
        rv_receipts.layoutManager = layoutManager2

        val layoutManager3 = GridLayoutManager(this, 3)
        rv_coins.layoutManager = layoutManager3


    }

    private fun initCard_coins() {
        cards_coins  = ArrayList()
        cards_coins.add(
            CardItem(
                resources.getDrawable(R.drawable.coinicon, null).toBitmap(),
                "x5", "RM6.95", null,  backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f)
            )
        )

        cards_coins.add(
            CardItem(
                resources.getDrawable(R.drawable.twocoins, null).toBitmap(),
                "x300",
                "RM6.95",
                null,
                "WILL WIN",
                "ANOTHER COIN",  backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f)
            )
        )

        cards_coins.add(
            CardItem(
                resources.getDrawable(R.drawable.coinstree, null).toBitmap(),
                "x300",
                "RM6.95",
                null,
                null,
                "ANOTHER COIN", resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f)
            )
        )

        cards_coins.add(
            CardItem(
                resources.getDrawable(R.drawable.coinsfour, null).toBitmap(),
                "x5", "RM6.95", null,null,null, resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f)
            )
        )

        cards_coins.add(
            CardItem(
                resources.getDrawable(R.drawable.coinsfive, null).toBitmap(),
                "x300",
                "RM6.95",
                null,
                "WILL WIN",
                "ANOTHER COIN", backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f)
            )
        )

        cards_coins.add(
            CardItem(
                resources.getDrawable(R.drawable.coinssix, null).toBitmap(),
                "x300",
                "RM6.95",
                null,
                null,
                "ANOTHER COIN",  backgroundColor = resources.getColor(R.color.gold),
                textColor =resources.getColor(R.color.gold_f)
            )
        )
    }

    private fun initCard_receits() {
        cards_receipts = ArrayList()
        cards_receipts.add(
            CardItem(
                resources.getDrawable(R.drawable.readreceiptsone, null).toBitmap(),
                "x5", "1690", resources.getDrawable(R.drawable.coinicon, null).toBitmap(),
                backgroundColor = resources.getColor(R.color.light_blue),
                textColor =resources.getColor(R.color.blue)
            )
        )

        cards_receipts.add(
            CardItem(
                resources.getDrawable(R.drawable.readreceiptstwo, null).toBitmap(),
                "x300",
                "1690",
                resources.getDrawable(R.drawable.coinicon, null).toBitmap(),
                "WILL WIN",
                "ANOTHER COIN",backgroundColor = resources.getColor(R.color.light_blue),
                textColor =resources.getColor(R.color.blue)
            )
        )

        cards_receipts.add(
            CardItem(
                resources.getDrawable(R.drawable.readreceiptsthree, null).toBitmap(),
                "x300",
                "1690",
                resources.getDrawable(R.drawable.coinicon, null).toBitmap(),
                null,
                "ANOTHER COIN",backgroundColor = resources.getColor(R.color.light_blue), textColor =resources.getColor(R.color.blue))
        )
    }

    private fun initCards() {
        cards = ArrayList()
        cards.add(
            CardItem(
                resources.getDrawable(R.drawable.supercintaone, null).toBitmap(),
                "x5", "1690", resources.getDrawable(R.drawable.coinicon, null).toBitmap()
            )
        )

        cards.add(
            CardItem(
                resources.getDrawable(R.drawable.supercintatwo, null).toBitmap(),
                "x300",
                "1690",
                resources.getDrawable(R.drawable.coinicon, null).toBitmap(),
                "WILL WIN",
                "ANOTHER COIN"
            )
        )

        cards.add(
            CardItem(
                resources.getDrawable(R.drawable.supercintatree, null).toBitmap(),
                "x300",
                "1690",
                resources.getDrawable(R.drawable.coinicon, null).toBitmap(),
                null,
                "ANOTHER COIN"
            )
        )
    }
}