package com.example.foodapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.databinding.FoodItemBinding

class FoodLisAdapter : ListAdapter<ListF, RecyclerView.ViewHolder>(DIFF_CALLBACK){
    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ListF>() {

            override fun areItemsTheSame(oldItem: ListF, newItem: ListF): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ListF, newItem: ListF): Boolean {
                return oldItem.name == newItem.name || oldItem.imageUrl == newItem.imageUrl
            }

        }
    }

    private lateinit var binding: FoodItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        binding = FoodItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder){
            val item = getItem(position)
            holder.bind(item)
        }
    }

    inner class ViewHolder(val itemBinding: FoodItemBinding):
        RecyclerView.ViewHolder(itemBinding.root) {
        val ShareP = SharePref(itemBinding.tvName.context)

        fun bind(item: ListF){
            itemBinding.tvName.text = item.name
            itemBinding.tvName.setTextSize(ShareP.getFontSize())
            itemBinding.tvName.setOnClickListener {
                Toast.makeText(it.context,"name: ${item.name}",Toast.LENGTH_LONG).show()
            }
            itemBinding.ivAvatar.setImageResource(item.imageUrl)
        }
    }
}