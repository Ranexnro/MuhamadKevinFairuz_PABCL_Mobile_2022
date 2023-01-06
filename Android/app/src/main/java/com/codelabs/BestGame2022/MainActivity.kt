package com.codelabs.BestGame2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.codelabs.BestGame2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main), Toolbar.OnMenuItemClickListener {
    private val binding: ActivityMainBinding by viewBinding()
    private val list: ArrayList<Games> = arrayListOf()
    private lateinit var toolbar2: Toolbar

    override fun setSupportActionBar(toolbar: Toolbar?) {
        super.setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "My App"
            subtitle = "BestGame2022"

            setDisplayShowCustomEnabled(true)
            setLogo(R.drawable.ic_baseline_account_circle_24)
            setDisplayUseLogoEnabled(true)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private lateinit var listGameAdapter: ListGameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        toolbar2 = findViewById(R.id.toolbar2)

        toolbar2.setOnMenuItemClickListener(this)

        binding.rvGames.setHasFixedSize(true)
        list.addAll(GamesData.listData)

        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        binding.apply {
            rvGames.layoutManager = LinearLayoutManager(this@MainActivity)
            listGameAdapter = ListGameAdapter(list)
            rvGames.adapter = listGameAdapter
        }
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.profile -> run{
                val tentang = Intent(this@MainActivity, ProfileActivity::class.java)
                tentang.putExtra(ProfileActivity.EXTRA_DETAIL, arrayOf(ProfileData))
                startActivity(tentang)

            }
        }
        return true
    }
}


