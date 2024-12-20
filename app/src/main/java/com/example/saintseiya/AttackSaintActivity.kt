package com.example.saintseiya

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import com.bumptech.glide.Glide
import com.example.saintseiya.databinding.ActivityAtackSaintBinding
import com.example.saintseiya.repositories.SaintService

class AttackSaintActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAtackSaintBinding
    private lateinit var sound : MediaPlayer
    private lateinit var sound2 : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAtackSaintBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val currentSait = SaintService.currentSaint
        chargeSaint()
        imageCharge(currentSait!!.presentationPhoto)
        binding.tvName.text = currentSait.name
        sound = MediaPlayer.create(this,currentSait.theme)
        sound.start()

        binding.btnAttack1.text = currentSait.attack[0].name
        binding.btnAttack2.text = currentSait.attack[1].name
        binding.btnAttack3.text = currentSait.attack[2].name

        binding.btnAttack1.setOnClickListener {
            imageCharge(currentSait.attack[0].gif)
            sound2 = MediaPlayer.create(this,currentSait.attack[0].sound)
            sound2.start()
        }

        binding.btnAttack2.setOnClickListener {
            imageCharge(currentSait.attack[1].gif)
            sound2 = MediaPlayer.create(this,currentSait.attack[1].sound)
            sound2.start()
        }

        binding.btnAttack3.setOnClickListener {
            imageCharge(currentSait.attack[2].gif)
            sound2 = MediaPlayer.create(this,currentSait.attack[2].sound)
            sound2.start()
        }
    }


    private fun imageCharge(presentationPhoto: String) {
        Glide.with(this)
            .load(presentationPhoto)
            .into(binding.ivImagePrincipal)

    }

    private fun chargeSaint() {
        Glide.with(this)
            .load(R.drawable.title)
            .into(binding.ivTitleAttack)
    }

    override fun onDestroy() {
        super.onDestroy()
        sound.stop()
        sound.release()


    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            val goAttack = Intent(this,SaintListActivity::class.java)
            startActivity(goAttack)
            finish()


            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}