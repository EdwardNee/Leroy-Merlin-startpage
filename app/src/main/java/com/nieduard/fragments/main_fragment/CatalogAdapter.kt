package com.nieduard.fragments.main_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.nieduard.data.CatalogData
import com.nieduard.prj.R

/**
 * Adapter for catalog menu.
 */
class CatalogAdapter(private val catalogList : List<CatalogData>) : RecyclerView.Adapter<CatalogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_catalog, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        val currItem = catalogList[position]
        holder.imageView.setImageResource(currItem.imageResource)
    }

    override fun getItemCount() = catalogList.size

}

/**
 * ViewHolder to hold the data.
 */
class CatalogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.cat_image)
}