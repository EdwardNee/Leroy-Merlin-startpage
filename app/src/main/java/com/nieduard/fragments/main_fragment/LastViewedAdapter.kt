package com.nieduard.fragments.main_fragment

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.nieduard.data.LastViewedData

class LastViewedAdapter(private val recentViewedList : List<LastViewedData>) : RecyclerView.Adapter<> {
}

class LastViewedViewHolder(private val itemView : View) : RecyclerView.ViewHolder(itemView){

}