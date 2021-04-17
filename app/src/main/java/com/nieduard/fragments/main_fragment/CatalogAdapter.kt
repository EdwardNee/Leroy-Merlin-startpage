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
class CatalogAdapter(private val catalogList : List<CatalogData>) : RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_catalog, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val currItem = catalogList[position]

        holder.imageView.setImageResource(currItem.imageResource)
    }

    override fun getItemCount() = catalogList.size

}

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.cat_image)
}