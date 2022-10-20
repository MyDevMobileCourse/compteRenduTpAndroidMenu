package com.example.menu2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var nom: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.email)
        nom = findViewById(R.id.nom)
        registerForContextMenu(email)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.cont_menu,menu)
        menu?.setHeaderTitle("ContextMenu")
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search -> {
                Toast.makeText(this, "Menu search selectionnée", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.ch1 -> {
                Toast.makeText(this, "Menu ch1 selectionnée", Toast.LENGTH_SHORT).show()
                true
            }
            else -> {
                super.onContextItemSelected(item)
            }
        }
    }
}