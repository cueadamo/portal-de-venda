package com.example.portal

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var url = ""
    var ml = 0
    var buscape = 0
    var ebay = 0
    var maglu = 0
    var webm = 0
    var sub = 0
    var netshoes = 0
    var americanas = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btRelatorio.setOnClickListener { view: View? ->


            var intent = Intent(this, Relatorio::class.java)
            startActivity(intent)
            

        }
    }


    fun onClick(view: View) {
        var sh = getSharedPreferences("contagem", Context.MODE_PRIVATE);
        when (findViewById<ImageButton>(view.id)){
            btMl -> {
                url="https://www.mercadolivre.com.br"
                ml = ml+1
                sh.edit().putInt("shMl", ml).apply()
            }
            btBuscape -> {
                url="https://www.buscape.com.br"
                buscape = buscape+1
                sh.edit().putInt("shBuscape", buscape).apply()
            }
            btEbay -> {
                url = "https://www.ebay.com"
                ebay = ebay + 1
                sh.edit().putInt("shEbay", ebay).apply()
            }
            btMaglu -> {
                url = "https://www.magazineluiza.com.br"
                maglu = maglu + 1
                sh.edit().putInt("shMaglu", maglu).apply()
            }
            btWebm -> {
                url = "https://www.webmotors.com.br"
                webm = webm + 1
                sh.edit().putInt("shWebm", webm).apply()
            }
            btSub -> {
                url = "https://www.submarino.com.br"
                sub = sub + 1
                sh.edit().putInt("shSub", sub).apply()
            }
            btNetshoes -> {
                url = "https://www.netshoes.com.br"
                netshoes = netshoes + 1
                sh.edit().putInt("shMl", netshoes).apply()
            }
            btAmericanas -> {
                url = "https://www.americanas.com.br"
                americanas = americanas + 1
                sh.edit().putInt("shMl", americanas).apply()
            }
        }

        var intent = Intent(this, Site::class.java)
        startActivity(intent);

        intent.putExtra("url", url)
        startActivity(intent)


    }
}
