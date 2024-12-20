package com.example.saintseiya

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.saintseiya.adapter.SaintAdapter
import com.example.saintseiya.data.Saint
import com.example.saintseiya.databinding.ActivitySaintListBinding
import com.example.saintseiya.repositories.SaintService

class SaintListActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySaintListBinding
    private lateinit var sound : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaintListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sound = MediaPlayer.create(this,R.raw.hadesopening)
        sound.start()
        initList()
    }

    private fun initList() {
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerSaint.layoutManager = linearLayoutManager
        binding.recyclerSaint.adapter = SaintAdapter(SaintService.saintList){

            selectSaint(it)
        }

    }

    private fun selectSaint(saint : Saint) {
        Toast.makeText(this,saint.name,Toast.LENGTH_SHORT).show()
        SaintService.currentSaint = saint
        val goAttack = Intent(this,AttackSaintActivity::class.java)
        startActivity(goAttack)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        sound.stop()
        sound.release()


    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            val goAttack = Intent(this,MainActivity::class.java)
            startActivity(goAttack)
            finish()


            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}