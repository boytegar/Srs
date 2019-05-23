package id.project.sistemrumahsakit.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import id.project.sistemrumahsakit.R
import id.project.sistemrumahsakit.Adapter.AdapterPoli
import kotlinx.android.synthetic.main.fragment_list_ruangan.view.*

class ListRuanganFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_list_ruangan, container, false)
        (activity as AppCompatActivity).setSupportActionBar(v.toolbar)
        (activity as AppCompatActivity).supportActionBar!!.title = "Daftar Poliklinik"
        (activity as AppCompatActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        setHasOptionsMenu(true)
        val a = ArrayList<String>()
        a.add("P. Anak")
        a.add("P Jantung")
        a.add("P. Penyakit Dalam")
        a.add("P. Gigi")

        val adapterPoli = AdapterPoli(a)
        v.list_poli.layoutManager = LinearLayoutManager(activity!!.applicationContext)
        v.list_poli.hasFixedSize()
        v.list_poli.adapter = adapterPoli

        return v
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                activity!!.onBackPressed()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

}
