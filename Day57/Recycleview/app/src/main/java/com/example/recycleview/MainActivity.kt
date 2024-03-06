package com.example.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var personListDetail = arrayListOf<personDetails>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        personListDetail = ArrayList<personDetails>()
        personListDetail.add(personDetails("Prashant Manandhar","9860440088"))
        personListDetail.add(personDetails("Prashant Manandhar","9860440088"))
        personListDetail.add(personDetails("Prashant Manandhar","9860440088"))
        personListDetail.add(personDetails("Prashant Manandhar","9860440088"))
        personListDetail.add(personDetails("Prashant Manandhar","9860440088"))
        personListDetail.add(personDetails("Prashant Manandhar","9860440088"))


        binding.rcv1.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        binding.rcv1.adapter=rcvAdaptor(this,personListDetail)
    }
}