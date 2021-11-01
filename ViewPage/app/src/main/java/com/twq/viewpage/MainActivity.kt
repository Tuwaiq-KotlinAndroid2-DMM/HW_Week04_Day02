package com.twq.viewpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
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
        var stoolBar=findViewById<Toolbar>(R.id.stoolbar)
        setSupportActionBar(stoolBar)

        var slider =findViewById<MaterialDrawerSliderView>(R.id.slider)

        var itemHome= PrimaryDrawerItem().apply {
            nameRes=R.string.Home
            iconRes=R.drawable.ic_baseline_home_24
            identifier=1
        }
        var itemGame= PrimaryDrawerItem().apply {
            nameRes=R.string.Game
            iconRes=R.drawable.ic_baseline_videogame_asset_24
            identifier=2
        }
        var itemSetting= SecondaryDrawerItem().apply {
            nameRes=R.string.setting
            iconRes=R.drawable.ic_baseline_settings_24
            identifier=3
        }

        slider.itemAdapter.add(itemHome,itemGame, DividerDrawerItem(),itemSetting)

        slider.onDrawerItemClickListener={v, item, position ->

            when(item.identifier){
                itemHome.identifier->{}
                itemGame.identifier->{
                    Toast.makeText(this, "user clicked game", Toast.LENGTH_SHORT).show()
                }
                itemSetting.identifier->{}
            }
            false
        }

        var headerView = AccountHeaderView(this).apply {
            attachToSliderView(slider)
            addProfiles(
                ProfileDrawerItem().apply { nameText = "Mike Penz"; descriptionText = "mikepenz@gmail.com"; iconRes = R.drawable.ic_baseline_person_24; identifier = 102 }
            )
            onAccountHeaderListener = { view, profile, current ->

                false
            }
            withSavedInstance(savedInstanceState)
        }

        stoolBar.setNavigationIcon(R.drawable.ic_baseline_menu_24)
        stoolBar.setNavigationOnClickListener {
            slider.drawerLayout?.openDrawer(slider)
        }

        var viewPager=findViewById<ViewPager>(R.id.mViewPager)
        viewPager.adapter=InstaAdapter(supportFragmentManager)
 }
}