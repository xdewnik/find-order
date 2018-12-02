package com.kulya.dev.findorder

import android.os.Bundle
import android.support.v7.app.AppCompatDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kulya.dev.findorder.ex.hide
import com.kulya.dev.findorder.ex.show
import kotlinx.android.synthetic.main.fragment_find_order.*

class FindOrderFragment:AppCompatDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_find_order, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        find_button.setOnClickListener {
            if (find_order.text.isNotEmpty()){
                openMapFragment()
            }else{
                find_mainview.hide()
                find_notfound.show()
            }
        }
    }
}
