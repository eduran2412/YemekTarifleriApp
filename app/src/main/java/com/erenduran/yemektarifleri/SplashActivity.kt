package com.erenduran.yemektarifleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils

import com.erenduran.yemektarifleri.databinding.ActivitySplashBinding

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    private val splashScreen = 8000
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        // animasyon dosyalarına erişim

        val animasyon1 = AnimationUtils.loadAnimation(this,R.anim.animasyon1)
        val animasyon2 = AnimationUtils.loadAnimation(this,R.anim.animasyon2)
        val animasyon3 = AnimationUtils.loadAnimation(this,R.anim.animasyon3)

        // animasyonları tasarım elemanları içine yüklemek
        // elemanlara erişmek

        val imageView = binding.imageView
        val imageView2 = binding.imageView2
        val baslik = binding.baslik
        val aciklama = binding.aciklama

        // tasarım elemanları içerisine animasyonları aktarma
        imageView.animation = animasyon1
        imageView2.animation = animasyon2
        baslik.animation = animasyon3
        aciklama.animation = animasyon3

        // splash screen tanımlama
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        },splashScreen.toLong())


    }
}