package com.example.vizeuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var corba = findViewById<CheckBox>(R.id.corba)
        var ezo = findViewById<RadioButton>(R.id.ezo)
        var dugun = findViewById<RadioButton>(R.id.dugun)
        var mercimek = findViewById<RadioButton>(R.id.mercimek)
        var brokoli = findViewById<RadioButton>(R.id.brokoli)
        var kellepaca = findViewById<RadioButton>(R.id.kellepaca)
        var yayla = findViewById<RadioButton>(R.id.yayla)
        var sehriye = findViewById<RadioButton>(R.id.sehriye)
        var domates = findViewById<RadioButton>(R.id.domates)
        var tarhana = findViewById<RadioButton>(R.id.tarhana)
        var mantar = findViewById<RadioButton>(R.id.mantar)
        var iskembe = findViewById<RadioButton>(R.id.iskembe)
        var tavuk = findViewById<RadioButton>(R.id.tavuk)
        var button = findViewById<Button>(R.id.button)
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        corba.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                ezo.visibility = View.VISIBLE
                dugun.visibility = View.VISIBLE
                mercimek.visibility = View.VISIBLE
                brokoli.visibility = View.VISIBLE
                kellepaca.visibility = View.VISIBLE
                yayla.visibility = View.VISIBLE
                sehriye.visibility = View.VISIBLE
                domates.visibility = View.VISIBLE
                tarhana.visibility = View.VISIBLE
                mantar.visibility = View.VISIBLE
                iskembe.visibility = View.VISIBLE
                tavuk.visibility = View.VISIBLE
                button.visibility = View.VISIBLE
            }
        }
        button.setOnClickListener{
            var mercimekdurum=mercimek.isChecked
            var ezodurum=ezo.isChecked
            var yayladurum=yayla.isChecked
            var dugundurum=dugun.isChecked
            var mantardurum=mantar.isChecked
            var kellepacadurum=kellepaca.isChecked
            var brokolidurum=brokoli.isChecked
            var sehriyedurum=sehriye.isChecked
            var domatesdurum=domates.isChecked
            var tarhanadurum=tarhana.isChecked
            var iskembedurum=iskembe.isChecked
            var tavukdurum=tavuk.isChecked


            var id:Int=radioGroup.checkedRadioButtonId
            if (id!=-1){
                if (mercimekdurum==true){
                    var anahtar="Mercimek"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Mercimek Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                    var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                    dordegecis.putExtra("aktarilancorba",anahtar)
                    startActivity(dordegecis)
                        finish()
                },2000)
                }
                if (ezodurum==true){
                    var anahtar="Ezogelin"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Ezogelin Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (yayladurum==true){
                    var anahtar="Yayla"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Yayla Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (dugundurum==true){
                    var anahtar="Düğün"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Düğün Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (mantardurum==true){
                    var anahtar="Mantar"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Mantar Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (kellepacadurum==true){
                    var anahtar="Kelle Paça"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Kelle Paça Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (brokolidurum==true){
                    var anahtar="Brokoli"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Brokoli Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (sehriyedurum==true){
                    var anahtar="Şehriye"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Şehriye Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (domatesdurum==true){
                    var anahtar="Domates"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Domates Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (tarhanadurum==true){
                    var anahtar="Tarhana"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Tarhana Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (iskembedurum==true){
                    var anahtar="İşkembe"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="işkembe Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
                if (tavukdurum==true){
                    var anahtar="Tavuk"
                    var tasarim=layoutInflater.inflate(R.layout.toastozel,null)
                    var ozeltoastyazi=tasarim.findViewById<TextView>(R.id.toastyazi)
                    ozeltoastyazi.text="Tavuk Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var toastozel=Toast(applicationContext)
                    toastozel.view=tasarim
                    toastozel.duration=Toast.LENGTH_SHORT


                    toastozel.show()
                    Handler().postDelayed({
                        var dordegecis=Intent(applicationContext,MainActivity4::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
            }
            else{
                val uyari=AlertDialog.Builder(this)
                uyari.setTitle("Uyari!")
                uyari.setMessage("Lütfen Seçiminizi yapınız")
                uyari.setIcon(R.drawable.bklogo)
                uyari.setNeutralButton("Tekrar Dene"){DialogInterface, i->

                }
                uyari.create().show()
            }
        }
    }
}


