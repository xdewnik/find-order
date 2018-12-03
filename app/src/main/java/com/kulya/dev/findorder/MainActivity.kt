package com.kulya.dev.findorder

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            openFragment()
        }

    }


    private fun openFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, FindOrderFragment())
        fragmentTransaction.commit()
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount>1){
            super.onBackPressed()
        }else{
            finish()
        }

    }
}