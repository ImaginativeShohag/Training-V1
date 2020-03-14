package org.imaginativeworld.dayone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import org.imaginativeworld.dayone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnOne.setOnClickListener {

            Toast.makeText(
                    applicationContext,
                    "New Toast!!!",
                    Toast.LENGTH_LONG
                )
                .show()

            Snackbar.make(
                    container,
                    "New snackbar",
                    Snackbar.LENGTH_LONG
                )
                .show()

        }

        binding.btnTwo.setOnClickListener {

            startActivity(Intent(this, FormActivity::class.java))

        }

        binding.btnList.setOnClickListener {

            startActivity(Intent(this, ListActivity::class.java))

        }

        binding.btnRv.setOnClickListener {

            startActivity(Intent(this, RecyclerViewActivity::class.java))

        }



    }
}
