package id.project.sistemrumahsakit.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.project.sistemrumahsakit.R
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v=  inflater.inflate(R.layout.fragment_register, container, false)
        (activity as AppCompatActivity).setSupportActionBar(v.toolbar)
        (activity as AppCompatActivity).supportActionBar!!.title = "Register"
        (activity as AppCompatActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        setHasOptionsMenu(true)
        return v
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                Toast.makeText(activity,"clicked", Toast.LENGTH_SHORT).show()
                activity!!.onBackPressed()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

}
