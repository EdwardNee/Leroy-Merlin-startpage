package com.nieduard.fragments.main_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nieduard.data.CatalogData
import com.nieduard.data.ItemsData
import com.nieduard.fragments.main_fragment.adapters.CatalogAdapter
import com.nieduard.fragments.main_fragment.adapters.LastViewedAdapter
import com.nieduard.fragments.main_fragment.adapters.OfferAdapter
import com.nieduard.main_class.R

class MainFragment : Fragment() {

    /**
     * Catalog images.
     */
    private val catalogList = listOf(
        CatalogData(R.drawable.h1),
        CatalogData(R.drawable.h2),
        CatalogData(R.drawable.h3)
    )

    /**
     * Last viewed items.
     */
    private val recentList = listOf(
        ItemsData(
            R.drawable.laminate,
            930.6,
            "Ламинат Artens \"Тангай\" 33 класс толщина 8 мм 1.986"
        ),
        ItemsData(
            R.drawable.perforator,
            4998.0,
            "Перфоратор SDS-plus Dexter Power Z1C-HW-2662SREP, 800 Вт, 3 Дж"
        ),
        ItemsData(
            R.drawable.wallpaper,
            1737.0,
            "Обои флизелиновые Erismann Paradiso бежевые 1.06 м 3040-2"
        )
    )

    /**
     * Last viewed items.
     */
    private val offersList = listOf(
        ItemsData(
            R.drawable.shtukaturka,
            413.0,
            "Штукатурка гипсовая Knauf Ротбанд 30 кг"
        ),
        ItemsData(
            R.drawable.perforator,
            4998.0,
            "Перфоратор SDS-plus Dexter Power Z1C-HW-2662SREP, 800 Вт, 3 Дж"
        ),
        ItemsData(
            R.drawable.lamp,
            4685.0,
            "Светильник потолочный LED \"Rimini\" с пультом ДУ, 24 м², регулируемый свет, с диммером и RGB подсветкой, цвет белый матовый"
        ),
        ItemsData(
            R.drawable.granit,
            735.35,
            "Керамогранит Euroceramika Карвалио15x60 см 1.35 м² цвет серый"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Init holders.
        setUpCatalogAdapter(view)
        setUpLastViewedAdapter(view)
        setUpOffersAdapter(view)
    }

    private fun setUpCatalogAdapter(view: View) {
        view.findViewById<RecyclerView>(R.id.rv_cat).apply {
            //Set a grid: views will be in a horizontal line
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            //Instantiate adapter for recycler
            val adapter = CatalogAdapter(catalogList)
            this.adapter = adapter
        }
    }

    private fun setUpLastViewedAdapter(view: View) {
        view.findViewById<RecyclerView>(R.id.rv_recent).apply {
            //Set a grid: views will be in a horizontal line
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            //Instantiate adapter for recycler
            val adapter = LastViewedAdapter(recentList)
            this.adapter = adapter
        }
    }

    private fun setUpOffersAdapter(view: View) {
        view.findViewById<RecyclerView>(R.id.rv_restricted).apply {
            //Set a grid: views will be in a horizontal line
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            //Instantiate adapter for recycler
            val adapter = OfferAdapter(offersList)
            this.adapter = adapter
        }
    }

}