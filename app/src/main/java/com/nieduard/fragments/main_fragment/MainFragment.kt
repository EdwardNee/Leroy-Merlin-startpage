package com.nieduard.fragments.main_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nieduard.data.CatalogData
import com.nieduard.prj.R

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<RecyclerView>(R.id.rv_cat).apply {
            //Set a grid: views will be in a 2 columns
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            //Instantiate adapter for recycler
            val list = listOf<CatalogData>(
                CatalogData(R.drawable.h1),
                CatalogData(R.drawable.h2),
                CatalogData(R.drawable.h3)
            )
            val adapter = CatalogAdapter(list)
            //addItemDecoration(CharacterItemDecoration(50))
            this.adapter = adapter
        }
    }
}