package org.imaginativeworld.daytwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.daytwo.databinding.ActivityLifecycleBinding
import timber.log.Timber

// Link: https://developer.android.com/guide/components/activities/activity-lifecycle
class LifecycleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLifecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timber.d("onCreate()")
    }

    override fun onStart() {
        super.onStart()

        Timber.d("onStart()")
    }

    override fun onResume() {
        super.onResume()

        Timber.d("onResume()")
    }

    override fun onPause() {
        super.onPause()

        Timber.d("onPause()")
    }

    override fun onStop() {
        super.onStop()

        Timber.d("onStop()")
    }

    override fun onRestart() {
        super.onRestart()

        Timber.d("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Timber.d("onDestroy()")
    }
}
