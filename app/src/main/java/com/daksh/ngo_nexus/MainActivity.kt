package com.daksh.ngo_nexus

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_search_ngo -> {
                // Do something for item 1
                true
            }
            R.id.menu_donate-> {
                // Do something for item 2
                true
            }
            R.id.menu_ngo_type-> {
                // Do something for item 3
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
