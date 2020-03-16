package org.imaginativeworld.daytwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.daytwo.databinding.ActivityJsonListBinding

class JsonListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJsonListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJsonListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
