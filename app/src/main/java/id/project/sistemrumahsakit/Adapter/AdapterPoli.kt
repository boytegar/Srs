package id.project.sistemrumahsakit.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import id.project.sistemrumahsakit.R
import kotlinx.android.synthetic.main.list_poli.view.*

class AdapterPoli(var list: ArrayList<String>): RecyclerView.Adapter<AdapterPoli.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.bind(item)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(room: String) {
            itemView.txt_name.text  = room
        }
    }
    override fun onCreateViewHolder(views: ViewGroup, position: Int):ViewHolder {
        val layoutInflater = LayoutInflater.from(views.context).inflate(R.layout.list_poli,views,false)
        return ViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}