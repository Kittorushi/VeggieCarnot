package com.veggie.android.simpeldesa.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.veggie.android.simpeldesa.R
import com.veggie.android.simpeldesa.adapter.VegiAdapter
import com.veggie.android.simpeldesa.api.models.veggie.RecordsItem
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {


    private val homeViewModel: HomeViewModel by viewModel()
    var adapter: ArrayAdapter<String>? = null
    var flag = "Default"
    var filterEnable = "disable"
    var selectedFilter = "gujarat"
    var empty = "empty"

    var mAdapter: VegiAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val sortingbtnHigh: Button = root.findViewById(R.id.sortHigh)
        val sortingbtnLow: Button = root.findViewById(R.id.sortLow)
        val filterTxt: TextView = root.findViewById(R.id.filterTxt)
        val sortTxt: TextView = root.findViewById(R.id.sortTxt)


        filterTxt.setOnClickListener {
            openDialog()
        }

        sortTxt.setOnClickListener {
            openDialogSort()
        }

        initObserver(flag)
        return root
    }


    //Setting Up Adapter
    fun setAdapter(arrayList: ArrayList<RecordsItem?>?) {


        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                rv1.visibility = View.INVISIBLE
                imageView2.visibility = View.VISIBLE

            } else {
                rv1.visibility = View.VISIBLE
                imageView2.visibility = View.GONE
                mAdapter = arrayList?.let { VegiAdapter(it) }
                rv1.layoutManager =
                    LinearLayoutManager(this.requireContext(), LinearLayoutManager.VERTICAL, false)
                rv1.adapter = this.mAdapter
            }

        }
    }

    private fun initObserver(flag: String?) {

        homeViewModel.vmGetListVeggie()
        homeViewModel.veggieList.observe(viewLifecycleOwner, Observer { listUser ->
            val arrayList = listUser.records?.let { ArrayList(it) }

            when(flag){
                "High" ->{
                    arrayList?.sortByDescending { it?.modalPrice?.trim()?.toInt()  }
                    setAdapter(arrayList)
                }
                "Low" ->{
                    arrayList?.sortBy { it?.modalPrice?.trim()?.toInt()  }
                    setAdapter(arrayList)
                }
                "Default" ->{
                    setAdapter(arrayList)
                }

            }

        })
    }

    private fun initObserverFilterd (flag: String?, selectedFromList: String) {

        homeViewModel.vmGetFilterListVeggie(selectedFromList)
        homeViewModel.veggieFilterList.observe(viewLifecycleOwner, Observer { listUser ->
            val arrayList = listUser.records?.let { ArrayList(it) }

            when(flag){
                "High" ->{
                    arrayList?.sortByDescending { it?.modalPrice?.trim()?.toFloat()?.toInt()  }
                    setAdapter(arrayList)
                }
                "Low" ->{
                    arrayList?.sortBy { it?.modalPrice?.trim()?.toFloat()?.toInt()  }
                    setAdapter(arrayList)
                }
                "Default" ->{
                    setAdapter(arrayList)
                }

            }

        })
    }

    fun openDialog() {
        filterEnable = "enable"
        val alertDialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@HomeFragment.requireContext())
        val rowList: View = layoutInflater.inflate(R.layout.dialog_layout, null)
        val getList = fillStatesArrayList()
        val listView = rowList.findViewById<ListView>(R.id.listView)
        adapter = ArrayAdapter(this@HomeFragment.requireContext(), android.R.layout.simple_list_item_1, getList)
        listView.adapter = adapter
        adapter!!.notifyDataSetChanged()
        alertDialog.setView(rowList)

        val dialog: android.app.AlertDialog = alertDialog.create()
        dialog.show()

        listView.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                val selectedFromList = listView.getItemAtPosition(position) as String
                selectedFilter = selectedFromList
                initObserverFilterd(flag,selectedFromList)
                dialog.dismiss()

            }
    }

    fun openDialogSort() {
        val alertDialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@HomeFragment.requireContext())
        val rowList: View = layoutInflater.inflate(R.layout.dialog_sort_layout, null)
        val array = arrayOf("High","Low")
        val listView = rowList.findViewById<ListView>(R.id.listView)
        adapter = ArrayAdapter(this@HomeFragment.requireContext(), android.R.layout.simple_list_item_1, array)
        listView.adapter = adapter
        adapter!!.notifyDataSetChanged()
        alertDialog.setView(rowList)

        val dialog: android.app.AlertDialog = alertDialog.create()
        dialog.show()

        listView.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                val selectedFromList = listView.getItemAtPosition(position) as String
                Log.d("TAG", "openDialog: $selectedFromList" )
                flag = selectedFromList

                if (filterEnable == "disable"){
                    initObserver(flag)
                }else if (filterEnable == "enable"){
                    initObserverFilterd(flag,selectedFilter)
                }




                dialog.dismiss()

            }
    }

    private fun fillStatesArrayList(): Array<String> {
        return arrayOf(
            "Andaman and Nicobar",
            "Andhra Pradesh",
            "Arunachal Pradesh",
            "Assam",
            "Bihar",
            "Chandigarh",
            "Chattisgarh",
            "Dadra and Nagar Haveli",
            "Daman and Diu",
            "Goa",
            "Gujarat",
            "Haryana",
            "Himachal Pradesh",
            "Jammu and Kashmir",
            "Jharkhand",
            "Karnataka",
            "Kerala",
            "Lakshadweep",
            "Madhya Pradesh",
            "Maharashtra",
            "Manipur",
            "Meghalaya",
            "Mizoram",
            "Nagaland",
            "NCT of Delhi",
            "NR",
            "Orissa",
            "Pondicherry",
            "Punjab",
            "Rajasthan",
            "Sikkim",
            "Tamil Nadu",
            "Telangana",
            "Tripura",
            "Uttar Pradesh",
            "Uttrakhand",
            "West Bengal"
        )
    }
}