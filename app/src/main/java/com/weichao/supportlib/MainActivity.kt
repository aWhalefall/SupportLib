package com.weichao.supportlib

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.weichao.supportlib.bottomsheet.SheetBottomActivity
import kotlinx.android.synthetic.main.bottom_sheet.*

class MainActivity : AppCompatActivity() {

    private var mBottomSheetBehavior: BottomSheetBehavior<LinearLayout> ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBottomSheetBehavior= BottomSheetBehavior.from(bottom_sheet)
        mBottomSheetBehavior?.state = BottomSheetBehavior.STATE_EXPANDED

        mBottomSheetBehavior?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(p0: View, newState: Float) {
                Log.d("---------------", "newState=" + newState);
            }

            override fun onStateChanged(p0: View, slideOffset: Int) {
                Log.d("---------------", "onSlide=" + slideOffset);
            }

        })
    }

    fun expandBottomSheet(view: View?) {
        mBottomSheetBehavior?.state = BottomSheetBehavior.STATE_EXPANDED
    }

    fun hideBottomSheet(view: View?) {
        mBottomSheetBehavior?.state = BottomSheetBehavior.STATE_HIDDEN
    }

    fun collapseBottomSheet(view: View?) {
        mBottomSheetBehavior?.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    fun sheetBottom(view: View) {
        startActivity(Intent(this,
            SheetBottomActivity::class.java))
    }
}