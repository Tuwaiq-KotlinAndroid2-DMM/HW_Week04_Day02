package com.example.toolbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mtoolbar = findViewById<Toolbar>(R.id.mToolBar)
        mtoolbar.title = getString(R.string.ALNASSAR)


        setSupportActionBar(mtoolbar)
        mtoolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24)
        mtoolbar.setNavigationOnClickListener {
            finish()
        }
    }

    // Inflater
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.ItemShare->{
                var sendIntent: Intent = Intent()
                sendIntent.action = Intent.ACTION_SEND
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
                sendIntent.type = "text/plain"
                startActivity(sendIntent)

                }


            R.id.ItemFilter->{
                Toast.makeText(this,"Filter is clicked",Toast.LENGTH_SHORT)
                println("Filter is clicked")
            }
        }
        return super.onOptionsItemSelected(item)
    }














}