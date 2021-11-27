package ru.pankratov.trofimov.vgav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mBtnStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtnStart = findViewById(R.id.button_start)
        mBtnStart.setOnClickListener {
            startPlayer()
        }
    }

    private fun startPlayer() {
        val intent = Intent(this, AudioPlayerActivity::class.java)
        intent.putExtra(
            AUDIO_URL,
            path_song
        )
        intent.putExtra(
            IMG_URL,
            path_img
        )
        startActivity(intent)
    }

    override fun onBackPressed() {
        Toast.makeText(this, "САШКА БЛЯ РАБОТАЕТ!! А ЁПТА", Toast.LENGTH_LONG).show()
        super.onBackPressed()
    }

    companion object {
        var path_song = "https://dl3s2.muzofond.fm/aHR0cDovL2YubXAzcG9pc2submV0L21wMy8wMDQvMDQxLzQyNC80MDQxNDI0Lm1wMw=="
        var path_img = "https://mp3push.com/images/artist/f69afcd63d08124943d657f522d44275.jpg"

        const val AUDIO_URL = "audio_url"
        const val IMG_URL = "image_url"
    }
}