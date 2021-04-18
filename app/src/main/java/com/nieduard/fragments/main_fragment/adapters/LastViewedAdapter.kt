package com.nieduard.fragments.main_fragment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nieduard.data.ItemsData
import com.nieduard.main_class.R

/**
 * Adapter for recently viewed items in main fragment.
 */
class LastViewedAdapter(private val recentViewedList: List<ItemsData>) :
    RecyclerView.Adapter<LastViewedViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LastViewedViewHolder {
        return LastViewedViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_recent, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LastViewedViewHolder, position: Int) {
        val currentItem = recentViewedList[position]
        holder.onBind(currentItem)
    }

    override fun getItemCount() = recentViewedList.size
}

/**
 * RecyclerView to hold the data.
 */
class LastViewedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageView: ImageView = itemView.findViewById(R.id.r_image)
    private val price: TextView = itemView.findViewById(R.id.r_price)
    private val name: TextView = itemView.findViewById(R.id.r_name)

    fun onBind(item: ItemsData) {
        val context = itemView.context
        imageView.setImageResource(item.imageResource)
        price.text = context.getString(R.string.string_price, item.price)
        name.text = context.getString(R.string.string_name, item.name)
    }
}