package com.example.vizeuygulamasi

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var corbacek=findViewById<TextView>(R.id.corbacek)
        var ozellikler=findViewById<TextView>(R.id.ozellikler)
        var ekstra=findViewById<TextView>(R.id.ekstraistek)
        var yenisiparis=findViewById<TextView>(R.id.yenisiparis)
        var cancel=findViewById<ImageView>(R.id.cikis)
//
//        val gelencorba=intent.getStringExtra("gecencorba")
//        val tuzoran=intent.getStringExtra("tuzoran")
//        val acioran=intent.getStringExtra("acioran")
//        corbacek.text="Bir $gelencorba Çorbası Çeeek, $acioran ve $tuzoran Olsun"
//
//        val gelensarimsak=intent.getStringExtra("sarimsaksec")
//        ozellikler.text=gelensarimsak

        var gelencorba =intent.getStringExtra("gecencorba")
        var tuzoran =intent.getStringExtra("tuzoran")
        if (tuzoran==null)
            tuzoran="Tuzsuz"
        var acioran =intent.getStringExtra("acioran")
        if(acioran==null)
            acioran="Acısız"
        corbacek.text="Bir $gelencorba Çorbası Çeeek, $acioran ve $tuzoran Olsun"

        val gelenarzu=intent.getStringExtra("arzular")
        ekstra.text="Ekstra İstek: $gelenarzu"

        val numberList=intent.getSerializableExtra("aktarilanozellik")
        ozellikler.text=numberList.toString()




        object :CountDownTimer(5000,5000){
            override fun onTick(p0: Long) {
               yenisiparis.visibility=View.INVISIBLE
                Handler().postDelayed({
                    yenisiparis.visibility=View.VISIBLE
                },400)
            }

            override fun onFinish() {

            }

        }.start()
        yenisiparis.setOnClickListener {
            var tekrardordegecis=Intent(applicationContext,MainActivity3::class.java)
            startActivity(tekrardordegecis)
            finish()
        }
        cancel.setOnClickListener {
            val uyari=AlertDialog.Builder(this)
            uyari.setTitle("Çıkış")
            uyari.setMessage("Çıkmak İstediğinize Emin misiniz?")
            uyari.setIcon(R.drawable.cikis)
            uyari.setPositiveButton("Evet"){DialogInterface, i ->
                System.exit(0)
            }
            uyari.setNegativeButton("Hayır"){DialogInterface, i->

            }
            uyari.create().show()
        }

    }
}