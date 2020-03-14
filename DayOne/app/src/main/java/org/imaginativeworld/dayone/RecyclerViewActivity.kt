package org.imaginativeworld.dayone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import org.imaginativeworld.dayone.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        binding.rv.setHasFixedSize(true)

        // use a linear layout manager
        val viewManger = LinearLayoutManager(this@RecyclerViewActivity)
        binding.rv.layoutManager = viewManger

        // specify an viewAdapter (see also next example)
        val lists = listOf<String>(
            "Bangladesh",
            "India",
            "Bidesh"
        )

        val viewAdapter = RecyclerViewAdapter()
        viewAdapter.addData(lists)

        binding.rv.adapter = viewAdapter


    }
}
