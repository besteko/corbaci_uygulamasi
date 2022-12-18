package com.example.vizeuygulamasi

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var p=findViewById<ProgressBar>(R.id.p)
        var b=findViewById<TextView>(R.id.b)
        var e=findViewById<TextView>(R.id.e)
        var s=findViewById<TextView>(R.id.s)
        var t=findViewById<TextView>(R.id.t)
        var e2=findViewById<TextView>(R.id.e2)
        var ch1=findViewById<ImageView>(R.id.ch1)
        var ch2=findViewById<ImageView>(R.id.ch2)
        var ch3=findViewById<ImageView>(R.id.ch3)
        var ch4=findViewById<ImageView>(R.id.ch4)
        var ch5=findViewById<ImageView>(R.id.ch5)

        b.setOnClickListener {
            ch1.visibility=View.VISIBLE
            e.setOnClickListener{
                ch2.visibility=View.VISIBLE
                s.setOnClickListener{
                    ch3.visibility=View.VISIBLE
                    t.setOnClickListener {
                        ch4.visibility=View.VISIBLE
                        e2.setOnClickListener {
                            ch5.visibility=View.VISIBLE
                            p.visibility=View.VISIBLE
                            if(ch5.isVisible){
                                Handler().postDelayed({

                                    var ucegecis=Intent(applicationContext,MainActivity3::class.java)
                                    startActivity(ucegecis)
                                    finish()
                                },1000)
                            }
                        }
                    }
                }
            }
        }

       }

    }
