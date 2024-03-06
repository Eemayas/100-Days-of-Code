package com.example.memegenerator

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.memegenerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val url = "https://meme-api.com/gimme"
    var currentImageUrl:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        getData()

        binding.share.setOnClickListener {
            val intent= Intent(Intent.ACTION_SEND)
            intent.type="text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,"Hey, Checkout this great meme from reddit $currentImageUrl")
            val chooser=Intent.createChooser(intent,"Share this meme using .....")
            startActivity(chooser)
        }

        binding.next.setOnClickListener {
            getData()
        }
    }

    private fun getData() {
        binding.progressCircular.visibility = View.VISIBLE
        // RequestQueue initialized
        val mRequestQueue = Volley.newRequestQueue(this)

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            { respose ->
               currentImageUrl= respose.getString("url")
                Glide.with(this).load(currentImageUrl).listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>,
                        isFirstResource: Boolean
                    ): Boolean {
                        binding.progressCircular.visibility = View.GONE
                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable,
                        model: Any,
                        target: Target<Drawable>?,
                        dataSource: DataSource,
                        isFirstResource: Boolean
                    ): Boolean {
                        binding.progressCircular.visibility = View.GONE
                        return false
                    }

                }).into(binding.imageView)
            },
            {
                Toast.makeText(this, "Something Went wrong", Toast.LENGTH_LONG).show()
                Log.d("error", it.localizedMessage)
            }
        )
        mRequestQueue.add(jsonObjectRequest)
        binding.progressCircular.visibility = View.VISIBLE
    }


}