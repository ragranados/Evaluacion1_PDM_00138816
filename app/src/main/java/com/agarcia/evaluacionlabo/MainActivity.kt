package com.agarcia.evaluacionlabo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_share.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    var cont1: Int = 0
    var cont2: Int = 0
    var cont3: Int = 0
    var cont4: Int = 0
    var cont5: Int = 0
    var cont6: Int = 0
    var cont7: Int = 0
    var cont8: Int = 0
    var cont9: Int = 0



    override fun onClick(v: View?) {
        var viewId: Int = v!!.id

        when(viewId){
            R.id.panel1 -> {
                cont1 += 1
                //Integer.parseInt(contador1.text.toString())+1
                contador1.text = (Integer.parseInt(contador1.text.toString())+1).toString()
            }

            R.id.panel2 -> {
                cont2 += 1
                contador2.text = cont2.toString()
            }

            R.id.panel3 -> {
                cont3 += 1
                contador3.text = cont3.toString()
            }

            R.id.panel4 -> {
                cont4 += 1
                contador4.text = cont4.toString()
            }

            R.id.panel5 -> {
                cont5 += 1
                contador5.text = cont5.toString()
            }

            R.id.panel6 -> {
                cont6 += 1
                contador6.text = cont6.toString()
            }

            R.id.panel7 -> {
                cont7 += 1
                contador7.text = cont7.toString()
            }

            R.id.panel8 -> {
                cont8 += 1
                contador8.text = cont8.toString()
            }

            R.id.panel9 -> {
                cont9 += 1
                contador9.text = cont9.toString()
            }

            R.id.enviar -> {
                enviar()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panel1.setOnClickListener(this)
        panel2.setOnClickListener(this)
        panel3.setOnClickListener(this)
        panel4.setOnClickListener(this)
        panel5.setOnClickListener(this)
        panel6.setOnClickListener(this)
        panel7.setOnClickListener(this)
        panel8.setOnClickListener(this)
        panel9.setOnClickListener(this)

        enviar.setOnClickListener(this)



    }

    fun enviar(){
        var mIntentShare : Intent = Intent(this@MainActivity,ShareActivity::class.java)
        mIntentShare.putExtra("Contador_1", cont1.toString())
        mIntentShare.putExtra("Contador_2", cont2.toString())
        mIntentShare.putExtra("Contador_3", cont3.toString())
        mIntentShare.putExtra("Contador_4", cont4.toString())
        mIntentShare.putExtra("Contador_5", cont5.toString())
        mIntentShare.putExtra("Contador_6", cont6.toString())
        mIntentShare.putExtra("Contador_7", cont7.toString())
        mIntentShare.putExtra("Contador_8", cont8.toString())
        mIntentShare.putExtra("Contador_9", cont9.toString())
        mIntentShare.putExtra("total",cont1+cont2+cont3+cont4+cont5+cont6+cont7+cont8+cont9)
        mIntentShare.putExtra("usuario",usuario.text.toString())
        mIntentShare.putExtra("correo",correo.text.toString())

        startActivity(mIntentShare)
    }


}
