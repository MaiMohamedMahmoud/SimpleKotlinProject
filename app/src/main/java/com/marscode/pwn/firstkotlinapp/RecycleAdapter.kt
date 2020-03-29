package com.marscode.pwn.firstkotlinapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter (public val Movies: ArrayList<Movie>, public val context:Context): RecyclerView.Adapter<RecycleAdapter.PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        //To change body of created functions use File | Settings | File Templates.
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false);
        return PhotoHolder(view)
    }

    override fun getItemCount(): Int {
       //To change body of created functions use File | Settings | File Templates.

        return Movies.size;
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        //To change body of created functions use File | Settings | File Templates.
        holder.bind( position)

    }



    inner class PhotoHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
        override fun onClick(p0: View?) {
             //To change body of created functions use File | Settings | File Templates.
            Toast.makeText(context,"This item has been Clicked", Toast.LENGTH_LONG).show()
        }

        private var mDateView: TextView? = null
        private var mDescriptionView: TextView? = null



        init {
            mDateView = itemView.findViewById(R.id.itemDate)
            mDescriptionView = itemView.findViewById(R.id.itemDescription)
            itemView.setOnClickListener(this)
        }
        fun bind(position: Int){
            mDateView?.text = Movies[position].Date
            mDescriptionView?.text = Movies[position].Description
        }


    }
}