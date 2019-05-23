package id.project.sistemrumahsakit.ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import id.project.sistemrumahsakit.R
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v =  inflater.inflate(R.layout.fragment_login, container, false)
        v.txt_register.setOnClickListener {
            Navigation.findNavController(v).navigate(R.id.action_register)
        }
        v.btn_login.setOnClickListener {
            Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_mainFragment)
        }
        return v
    }

}
