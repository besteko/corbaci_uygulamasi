package com.example.vizeuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.os.Handler
import androidx.appcompat.app.ActionBar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val animation=AnimationUtils.loadAnimation(this,R.anim.animation)

        var giris=findViewById<TextView>(R.id.giris)
        giris.animation=animation

        Handler().postDelayed({
            var ikiyegecis=Intent(applicationContext,MainActivity2::class.java)
            startActivity(ikiyegecis)
            finish()
        },2000)
    }

}

