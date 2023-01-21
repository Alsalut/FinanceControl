package com.example.financecontrol

import about_app.AboutApp
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //startActivity(Intent(this, Login::class.java))
    }

    // создаём меню приложения
    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.layout_menu_main_activity, menu)

        return super.onCreateOptionsMenu(menu)
    }

    // действия при нажатии пунктов меню
    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when (item.itemId) // нажали пункт меню
        {
            R.id.menu_1 -> startActivity(Intent(this, AboutApp::class.java))
            R.id.menu_2 -> startActivity(Intent(this, AboutApp::class.java))
            R.id.menu_3 -> startActivity(Intent(this, AboutApp::class.java))
            R.id.about_app -> startActivity(Intent(this, AboutApp::class.java))
        }

        return super.onOptionsItemSelected(item)
    }
}