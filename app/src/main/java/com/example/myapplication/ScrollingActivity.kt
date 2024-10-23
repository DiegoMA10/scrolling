package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val button1 = findViewById<Button>(R.id.button)
        button1.setOnClickListener{
            var url = "https://es.wikipedia.org/wiki/Dwayne_Johnson"
            var i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(i)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            var url = "https://es.wikipedia.org/wiki/Will_Smith"
            var i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(i)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            var url = "https://es.wikipedia.org/wiki/Cristiano_Ronaldo"
            var i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(i)
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            var url = "https://es.wikipedia.org/wiki/Daniel_Radcliffe"
            var i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(i)
        }

        /**
         *  setSupportActionBar(findViewById(R.id.toolbar))
         *         binding.toolbarLayout.title = title
         *         binding.fab.setOnClickListener { view ->
         *             Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
         *                 .setAction("Action", null)
         *                 .setAnchorView(R.id.fab).show()
         *         }
         */

    }
}