package org.imaginativeworld.daytwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.daytwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() {

        binding.btnLifecycle.setOnClickListener {

            startActivity(Intent(this, LifecycleActivity::class.java))

        }

    }
}
