package com.engineer.imitate.ui.fragments


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route

import com.engineer.imitate.R
import kotlinx.android.synthetic.main.fragment_layout_manager.*


/**
 * A simple [Fragment] subclass.
 *
 */
@Route(path = "/anim/layout_manager")
class LayoutManagerFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout_manager, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        for (i in 1..5) {
            val view = LayoutInflater.from(context).inflate(R.layout.image_item, null)
            container_vertical.addView(view)
        }


        for (i in 1..5) {
            val view = LayoutInflater.from(context).inflate(R.layout.image_item, null)
            container_horizontal.addView(view)
        }

        stack_view_layout_1.layoutDirection = View.LAYOUT_DIRECTION_LTR
        stack_view_layout_2.layoutDirection = View.LAYOUT_DIRECTION_RTL


    }


}
