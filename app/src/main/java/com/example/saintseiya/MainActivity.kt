package com.example.saintseiya

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.example.saintseiya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var principalTheme : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        principalTheme = MediaPlayer.create(this,R.raw.saintseiyathemaintro)
        principalTheme.start()
        chargeLogoPrincipal()
        chargeSaint()

        binding.btnEnter.setOnClickListener {
            val goList = Intent(this,SaintListActivity::class.java)
            startActivity(goList)
            principalTheme.stop()
            finish()
        }
    }

    private fun chargeSaint() {
        Glide.with(this)
            .load(R.drawable.title)
            .into(binding.ivTitle)
    }

    private fun chargeLogoPrincipal() {
        val url = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpKVgLJPO1sexLqE78KAkgTEgBqS4yySwRMwPESMDoOdrbMGR4hrGTAUF1BlUrW91MydN18nc9cri4Lv7OnApjRyw9RVpjGb6Dwmr-uLqZB-8PXkiMCKlHn5x2u8craV8hIUBtxlhYg3zW3UOWctDKJydeOhjrI7pDc2WxP8cPN2BeWAagHkE/s4099/Botonturbo.com-saint-seiya-wallpapers-8-imprimir.jpg"
        Glide.with(this)
            .load(url)
            .into(binding.ivPrincipal)
    }

    override fun onDestroy() {
        super.onDestroy()
        principalTheme.stop()
        principalTheme.release()


    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Do you want to exit the application?")
                .setPositiveButton("Yes") { _, _ ->
                    finishAffinity()
                }
                .setNegativeButton("No", null)
                .show()

            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}