package com.example.week4_day2_toolbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Filter
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mtoolBar=findViewById<androidx.appcompat.widget.Toolbar>(R.id.mtoolbar)

        mtoolBar.title=getString(R.string.Nada)
        mtoolBar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24)


        setSupportActionBar(mtoolBar)

        mtoolBar.setNavigationOnClickListener {
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

        R.id.item_share->{}
        R.id.item_filter->{
            Toast.makeText(this,"Filter item is clicked",Toast.LENGTH_SHORT).show()}

          R.id.item_share->{
              val intent = Intent()
              intent.action=Intent.ACTION_SEND
              intent.putExtra(Intent.EXTRA_TEXT"Hey check my App at :https://www.whatsapp.com/download" )
            }
        }
        return super.onOptionsItemSelected(item)
    }
}