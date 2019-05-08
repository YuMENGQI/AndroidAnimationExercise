package com.engineer.imitate.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route

import com.engineer.imitate.R
import com.engineer.imitate.util.toastShort
import kotlinx.android.synthetic.main.fragment_scroller.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
@Route(path = "/anim/scroller")
class ScrollerFragment : Fragment() {
    private var toggle: Boolean = false
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scroller, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        customView.setOnClickListener {
            context!!.toastShort("click")
            if (toggle) {
                customView.smoothScrollTo(95, 95)
            } else {
                customView.smoothScrollTo(0, 0)
            }
            toggle = !toggle
        }
    }


}
