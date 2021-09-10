package com.hixtrik.purenews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hixtrik.purenews.databinding.ActivityMainBinding
import com.hixtrik.purenews.ui.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val mainFragment = MainFragment()
        fragmentTransaction.replace(binding.frmContainer.id, mainFragment)
        fragmentTransaction.commit()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            super.onBackPressed()
        } else {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            val mainFragment = MainFragment()
            supportFragmentManager.popBackStack()
            fragmentTransaction.replace(binding.frmContainer.id, mainFragment)
            fragmentTransaction.commit()
        }
    }
}