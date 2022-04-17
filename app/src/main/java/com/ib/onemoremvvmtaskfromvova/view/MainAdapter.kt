package com.ib.onemoremvvmtaskfromvova.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ib.onemoremvvmtaskfromvova.R
import com.ib.onemoremvvmtaskfromvova.databinding.KidImageTemplateBinding
import com.ib.onemoremvvmtaskfromvova.network.model.RepositoryItem
import com.squareup.picasso.Picasso


class MainAdapter(private val kidsList: List<RepositoryItem>) : RecyclerView.Adapter<MainAdapter.KidHolder>() {

    class KidHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var repositoryItem: RepositoryItem
        private val binding = KidImageTemplateBinding.bind(view)
        fun bind(kid: RepositoryItem) {
            // binding.tvName.text = kid.id.toString()
 //           Picasso.get().load(repositoryItem.owner.avatar_url).into(binding.imageView);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KidHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.kid_image_template, parent, false)
        return KidHolder(view)
    }

    override fun onBindViewHolder(holder: KidHolder, position: Int) {
        holder.bind(kidsList[position])
    }

    override fun getItemCount(): Int {
        return kidsList.size
    }
}