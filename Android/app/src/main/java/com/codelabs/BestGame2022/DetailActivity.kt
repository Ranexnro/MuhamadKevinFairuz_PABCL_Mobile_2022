package com.codelabs.BestGame2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codelabs.BestGame2022.R
import com.codelabs.BestGame2022.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(R.layout.activity_detail) {
    private val binding : ActivityDetailBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setData()

    }

    private fun setData() {
        binding.apply {
            val games = intent.getParcelableExtra<Games>(EXTRA_DETAIL)

            tvGamesName.text = games?.name
            tvGenre.text = games?.genre
            tvRequirement.text = games?.requirement
            tvDetail.text = games?.detail

            Glide.with(this@DetailActivity)
                .load(games?.photo)
                .apply(RequestOptions())
                .into(ivGame)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true 
    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }
}