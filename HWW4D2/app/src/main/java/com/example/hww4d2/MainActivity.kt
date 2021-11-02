package com.example.hww4d2

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
        var mtoolbar=findViewById<Toolbar>(R.id.mToolbar)
        mtoolbar.title=getString(R.string.AppTitle)
        mtoolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24)
        setSupportActionBar(mtoolbar)


        mtoolbar.setNavigationOnClickListener {
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.item_share-> {       Toast.makeText(this, "share item is clicked!", Toast.LENGTH_SHORT).show()
                println("share is clicked")}
            R.id.item_filter->{
                Toast.makeText(this, "Filter item is clicked!", Toast.LENGTH_SHORT).show()
                println("Filter is clicked")
            }

        }

        return super.onOptionsItemSelected(item)
    }
}

