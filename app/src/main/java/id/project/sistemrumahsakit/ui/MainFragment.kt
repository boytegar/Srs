package id.project.sistemrumahsakit.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation

import id.project.sistemrumahsakit.R
import kotlinx.android.synthetic.main.fragment_main.view.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_main, container, false)
        (activity as AppCompatActivity).setSupportActionBar(v.toolbar)
        (activity as AppCompatActivity).supportActionBar!!.title = "Main Menu"
        v.btn_cari.setOnClickListener {
            Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_listRuanganFragment)
        }
        v.btn_dokter.setOnClickListener {
            Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_listRuanganFragment)
        }
        v.btn_scan.setOnClickListener {
            Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_scanFragment)
        }
        return v
    }


}
