package com.jawnnypoo.physicslayout.sample.view

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.jawnnypoo.physicslayout.sample.databinding.LayoutHeartBubbleItemViewBinding

class HeartBubbleItemView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
  FrameLayout(context, attrs) {

  private lateinit var binding: LayoutHeartBubbleItemViewBinding
  override fun onFinishInflate() {
    super.onFinishInflate()
    binding = LayoutHeartBubbleItemViewBinding.bind(this)
  }
  fun renderView() {}
}
