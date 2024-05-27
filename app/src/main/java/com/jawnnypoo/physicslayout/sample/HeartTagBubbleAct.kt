package com.jawnnypoo.physicslayout.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.jawnnypoo.physicslayout.sample.databinding.ActivityHeartTagBubbleBinding
import com.jawnnypoo.physicslayout.sample.databinding.LayoutHeartBubbleItemViewBinding

class HeartTagBubbleAct : AppCompatActivity() {

  private lateinit var binding: ActivityHeartTagBubbleBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityHeartTagBubbleBinding.inflate(LayoutInflater.from(this))
    setContentView(binding.root)
    initView()
    initData()
  }

  private fun initView() {}

  private fun initData() {
    for (i in 1..8) {
      val itemView =
        LayoutHeartBubbleItemViewBinding.inflate(LayoutInflater.from(this), null, false).root
      val params = ViewGroup.LayoutParams(400, 400)
      itemView.layoutParams = params
      binding.pflView.addView(itemView)
    }
  }
}
