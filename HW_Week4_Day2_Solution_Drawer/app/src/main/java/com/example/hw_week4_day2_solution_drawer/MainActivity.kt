package com.example.hw_week4_day2_solution_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.hw_week4_day2_solution_drawer.R.string
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



        var mtoolBar= findViewById<Toolbar>(R.id.mtoolbar)
        setSupportActionBar(mtoolBar)


        var slider=findViewById<MaterialDrawerSliderView>(R.id.slider)

        var itemHome= PrimaryDrawerItem().apply {
            nameRes=getString(string.home)
            iconRes=R.drawable.ic_baseline_home_24
            identifier=1
        }

        var itemGame= PrimaryDrawerItem().apply {
            nameRes=getString(string.play)
            iconRes=R.drawable.ic_baseline_videogame_asset_24
            identifier=2
        }

        var itemSetting= SecondaryDrawerItem().apply {
            nameRes=getString(string.settings)
            iconRes=R.drawable.ic_baseline_settings_24
            identifier=3
        }


        slider.itemAdapter.add(itemHome,itemGame, DividerDrawerItem(), itemSetting)


        slider.onDrawerItemClickListener={ v, item, position ->

            when(item.identifier){
                itemHome.identifier->{

                }
                itemGame.identifier->{

                    Toast.makeText(this, "User clicked Game", Toast.LENGTH_SHORT).show()
                    println("User clicked Game")
                }
                itemSetting.identifier->{}

            }

            false
        }

        // Create the AccountHeader
        var headerView = AccountHeaderView(this).apply {
            attachToSliderView(slider) // attach to the slider
            addProfiles(
                ProfileDrawerItem().apply { nameText = "Mike Penz"; descriptionText = "mikepenz@gmail.com"; iconRes = R.drawable.ic_baseline_person_24; identifier = 102 }
            )
            onAccountHeaderListener = { view, profile, current ->
                // react to profile changes
                false
            }
            withSavedInstance(savedInstanceState)
        }


        mtoolBar.setNavigationIcon(R.drawable.ic_baseline_menu_24)

        mtoolBar.setNavigationOnClickListener {

            slider.drawerLayout?.openDrawer(slider)
        }
    }
}