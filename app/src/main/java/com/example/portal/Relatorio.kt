package com.example.portal

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relatorio.*

class Relatorio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio)
        var sh = getSharedPreferences("contagem", Context.MODE_PRIVATE);

        txtMl.text = "Mercado Livre: ${sh.getInt("shMl", 10)}"
        txtBuscape.text = "Buscape: ${sh.getInt("shBuscape", 10)}"
        txtEbay.text = "Ebay: ${sh.getInt("shEbay", 10)}"
        txtMaglu.text = "Magalu: ${sh.getInt("shMaglu", 10)}"
        txtWebm.text = "Webmotors: ${sh.getInt("shWebm", 10)}"
        txtSub.text = "Submarino: ${sh.getInt("shSub", 10)}"
        txtNetshoes.text = "Netshoes: ${sh.getInt("shNetshoes", 10)}"
        txtAmericanas.text = "Americanas: ${sh.getInt("shAmericanas", 10)}"

    }
}
