package com.codelabs.BestGame2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codelabs.BestGame2022.databinding.AboutMeBinding


class ProfileActivity : AppCompatActivity() {
    private val binding: AboutMeBinding by viewBinding()

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_me)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setData()
    }
    private fun setData() {
        binding.apply {
            val profile = intent.getParcelableExtra<ProfileMe>(EXTRA_DETAIL)

            nameProfile.text = profile?.name
            aboutP.text = profile?.about


            Glide.with(this@ProfileActivity)
                .load(profile?.image)
                .apply(RequestOptions())
                .into(imageProfile)
        }
    }

}