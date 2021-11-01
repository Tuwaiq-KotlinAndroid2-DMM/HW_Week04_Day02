package com.example.week4day2slidingmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.descriptionText
import com.mikepenz.materialdrawer.model.interfaces.iconRes
import com.mikepenz.materialdrawer.model.interfaces.nameRes
import com.mikepenz.materialdrawer.model.interfaces.nameText
import com.mikepenz.materialdrawer.widget.AccountHeaderView
import com.mikepenz.materialdrawer.widget.MaterialDrawerSliderView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mtoolbar=findViewById<Toolbar>(R.id.mtoolbar)
        setSupportActionBar(mtoolbar)

        var slider=findViewById<MaterialDrawerSliderView>(R.id.slider)

        val itemhome = PrimaryDrawerItem().apply {
            nameRes=R.string.app_name
            iconRes=R.drawable.ic_baseline_home_24
            identifier=1
        }

        var itemGame=SecondaryDrawerItem().apply{
            nameRes=R.string.FreePlay
            iconRes=R.drawable.ic_baseline_videogame_asset_24
            identifier=2
        }

        var itemSetting=PrimaryDrawerItem().apply {
            nameRes=R.string.Setting
            iconRes=R.drawable.ic_baseline_settings_24
            identifier=3
        }

        slider.itemAdapter.add(itemhome,itemGame,DividerDrawerItem(),itemSetting)

        slider.onDrawerItemClickListener= { v, item, position ->
            // do something with the clicked item :D

            when(item.identifier){
                itemhome.identifier->{}
                itemGame.identifier->{
                    Toast.makeText(this, "User clicked play", Toast.LENGTH_SHORT).show()
                }
                itemSetting.identifier->{}
            }
            false
        }

       var headerView = AccountHeaderView(this).apply {
            attachToSliderView(slider) // attach to the slider
            addProfiles(
                ProfileDrawerItem().apply { nameText = "My App"; descriptionText = "someone@gmail.com"; iconRes = R.drawable.ic_baseline_person_24; identifier = 102 }
            )
            onAccountHeaderListener = { view, profile, current ->
                // react to profile changes
                false
            }
            withSavedInstance(savedInstanceState)
        }
       // slider.accountHeader=headerView

        mtoolbar.setNavigationIcon(R.drawable.ic_baseline_menu_24)
        mtoolbar.setNavigationOnClickListener {
            slider.drawerLayout?.openDrawer(slider)
        }


    }
}