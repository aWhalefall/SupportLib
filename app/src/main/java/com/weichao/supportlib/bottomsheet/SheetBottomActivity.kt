package com.weichao.supportlib.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.weichao.supportlib.R


/**
 * 底部弹窗 共五个中间态
 * 1.稳态
 * State_Expanded
 * State_Collapsed
 * State_HIDDEN
 * 2.中间态
 * State_Dragging
 * State_Settling
 *
 */

class SheetBottomActivity : AppCompatActivity() {
    private lateinit var dialog: BottomSheetDialog


    val STATE_DRAGGING: Int = 1
    private val STATE_SETTLING = 2


    private val STATE_EXPANDED = 3
    private val STATE_COLLAPSED = 4
    private val STATE_HIDDEN = 5
    private val STATE_HALF_EXPANDED = 6


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sheet_bottom)
    }

    fun hidden(view: View) {
        dialog?.hide()
    }

    fun show2(view: View) {
        dialog = BottomSheetDialog(this)
        val view = View.inflate(this,
            R.layout.bottom_sheet, null)
        dialog.setContentView(view)
        dialog?.show()
    }

    fun show(view: View) {
        dialog = BottomSheetDialog(this)
        val view = View.inflate(this,
            R.layout.recycleview_bottom_sheet, null)
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        val recycleView = view.findViewById<RecyclerView>(R.id.recycleview)
        recycleView.layoutManager = linearLayoutManager
        val list = listOf("1", "2", "3", "4", "5", "6", "7", "8")
        recycleView.adapter = Adapter(list)
        dialog.setContentView(view)
        dialog?.show()
    }


    inner class Adapter(list: List<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

        val mList = list

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val mView = view
            fun bind(position: Int) {
                val textView = mView.findViewById<TextView>(R.id.txt_title)
//                textView.text=mList[position-1]
                val s = mList[position]
                textView.text = s
            }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(this@SheetBottomActivity)
            return ViewHolder(layoutInflater.inflate(R.layout.item_bottom_sheet,parent,false))
        }

        override fun getItemCount(): Int {
            return mList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(position)
        }

    }
}