package com.example.menu3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import androidx.appcompat.view.menu.MenuView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var root: ConstraintLayout
    var color = Color.TRANSPARENT
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        root = findViewById(R.id.root)
        button.setOnClickListener {
            showPopUpMenu()
        }
    }
    fun showPopUpMenu() {
        val popMenu = PopupMenu(this, button)
        menuInflater.inflate(R.menu.popup_menu, popMenu.menu)
        val sub = popMenu.menu.addSubMenu("Colors")
        sub.add("Red")
            .setOnMenuItemClickListener {
                color = Color.RED
                root.setBackgroundColor(color)
                true
            }
        sub.add("Green")
            .setOnMenuItemClickListener {
                color = Color.GREEN
                root.setBackgroundColor(color)
                true
            }
        popMenu.show()
    }
}