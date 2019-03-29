package com.agarcia.evaluacionlabo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_share.*

class ShareActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)


        var intent: Intent = this.intent

        usuario_share.text = intent.getStringExtra("usuario")
        correo_share.text = intent.getStringExtra("correo")
        productos.text = intent.getStringExtra("total")

        contador1_share.text = intent.getStringExtra("Contador_1")
        contador2_share.text = intent.getStringExtra("Contador_2")
        contador3_share.text = intent.getStringExtra("Contador_3")
        contador4_share.text = intent.getStringExtra("Contador_4")
        contador5_share.text = intent.getStringExtra("Contador_5")
        contador6_share.text = intent.getStringExtra("Contador_6")
        contador7_share.text = intent.getStringExtra("Contador_7")
        contador8_share.text = intent.getStringExtra("Contador_8")
        contador9_share.text = intent.getStringExtra("Contador_9")

        /*compartir.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                var mIntent: Intent = Intent()
                mIntent.setAction("text/plain")
                mIntent.action = Intent.ACTION_SEND

                mIntent
            }

        })*/
    }
}
