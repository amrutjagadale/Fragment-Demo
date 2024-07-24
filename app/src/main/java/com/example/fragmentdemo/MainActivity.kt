package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            replaceFragment(FragmentOne())
        }
        binding.btn2.setOnClickListener {
            replaceFragment(FragmentTwo())
        }
    }
    private fun replaceFragment(frament : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,frament)
            .addToBackStack(null)
            .commit()
    }
}