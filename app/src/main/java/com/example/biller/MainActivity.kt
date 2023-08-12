package com.example.biller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.biller.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {calculatebill()}
        binding.button2.setOnClickListener {
            binding.username.text.clear()
            binding.apples.text.clear()
            binding.mangos.text.clear()
            binding.bananas.text.clear()
            binding.bananas.text.clear()
            binding.grapes.text.clear()
            binding.textView5.text=" "
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calculatebill() {

        val apples=binding.apples.text.toString()
        val applesv=apples.toDoubleOrNull()
        val mangos=binding.mangos.text.toString()
        val mangosv=mangos.toDoubleOrNull()
        val bananas=binding.bananas.text.toString()
        val bananasv=bananas.toDoubleOrNull()
        val grapes=binding.grapes.text.toString()
        val grapesv=grapes.toDoubleOrNull()
        if (applesv!=null && mangosv!=null && bananasv!=null && grapesv!=null){
            val value=applesv*200+mangosv*250+bananasv*30+grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv==null && mangosv!=null && bananasv!=null && grapesv!=null){
            val value=mangosv*250+bananasv*30+grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv!=null && mangosv==null && bananasv!=null && grapesv!=null){
            val value=applesv*200+bananasv*30+grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv!=null && mangosv!=null && bananasv==null && grapesv!=null){
            val value=applesv*200+mangosv*250+grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv!=null && mangosv!=null && bananasv!=null && grapesv==null){
            val value=applesv*200+mangosv*250+bananasv*30
            binding.textView5.text="Your bill is:Rs ${value}"
        }

        if (applesv==null && mangosv!=null && bananasv==null && grapesv!=null){
            val value=mangosv*250+grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv==null && mangosv!=null && bananasv!=null && grapesv==null){
            val value=mangosv*250+bananasv*30
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv!=null && mangosv==null && bananasv==null && grapesv!=null){
            val value=applesv*200+grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv!=null && mangosv==null && bananasv!=null && grapesv==null){
            val value=applesv*200+bananasv*30
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv!=null && mangosv!=null && bananasv==null && grapesv==null){
            val value=applesv*200+mangosv*250
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv==null && mangosv==null && bananasv!=null && grapesv!=null){
            val value=bananasv*30+grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv==null && mangosv==null && bananasv==null && grapesv!=null){
            val value=grapesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv!=null && mangosv==null && bananasv==null && grapesv==null){
            val value=applesv*200
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv==null && mangosv!=null && bananasv==null && grapesv==null){
            val value=mangosv*250
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv==null && mangosv==null && bananasv!=null && grapesv==null){
            val value=bananasv*30
            binding.textView5.text="Your bill is:Rs ${value}"
        }
        if (applesv==null && mangosv==null && bananasv==null && grapesv==null){
            val value=0
            binding.textView5.text="Your bill is:Rs ${value}"
        }

    }
}