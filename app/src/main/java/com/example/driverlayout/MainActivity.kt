package com.example.driverlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.driverlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            navigationView.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.cloudDownload -> {
                        Toast.makeText(this@MainActivity, "Cloud Download", Toast.LENGTH_SHORT).show()
                    }
                    R.id.cloudDone -> {
                        Toast.makeText(this@MainActivity, "Cloud Done", Toast.LENGTH_SHORT).show()
                    }
                    R.id.closeOff -> {
                        Toast.makeText(this@MainActivity, "Cloud Off", Toast.LENGTH_SHORT).show()
                    }
                    R.id.cloudWait -> {
                        Toast.makeText(this@MainActivity, "Cloud Wait", Toast.LENGTH_SHORT).show()
                    }
                }
                driver.closeDrawer(GravityCompat.START)
                true
            }

            buttonMenu.setOnClickListener{
                driver.openDrawer(GravityCompat.START)
            }
        }

    }

}