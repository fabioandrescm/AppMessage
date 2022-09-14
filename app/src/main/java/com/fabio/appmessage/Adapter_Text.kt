package com.fabio.appmessage

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class Adapter_Text(mainActivity: MainActivity) :PagerAdapter(){
    private val mImagenes =
        intArrayOf(R.drawable.mensajes, R.drawable.mensaje2, R.drawable.mensaje3)
    var contexto: Context? = mainActivity

    override fun getCount(): Int {
        return mImagenes.size
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(contexto)
        imageView.scaleType = ImageView.ScaleType.FIT_CENTER
        imageView.setImageResource(mImagenes[position])
        container.addView(imageView, 0)
        return imageView
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ImageView)
    }

}