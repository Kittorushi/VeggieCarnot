
package com.veggie.android.simpeldesa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.veggie.android.simpeldesa.R
import com.veggie.android.simpeldesa.api.models.veggie.RecordsItem

class VegiAdapter(authListNew: ArrayList<RecordsItem?>, empty: String = "full") :
    RecyclerView.Adapter<VegiAdapter.ViewHolder>() {

    var authListNew: ArrayList<RecordsItem?>
    var empty: String

    init {
        this.authListNew = authListNew
        this.empty = empty
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_layout, parent, false)
        )


    override fun onBindViewHolder(holder: VegiAdapter.ViewHolder, position: Int) {
//        Log.d("TAG", "onBindViewHolder: ${authListNew.size}")

        if (empty == "empty"){

        }else{
            val x = authListNew[position]
            holder.bindItems(x)
        }



    }

    override fun getItemCount(): Int {
        return authListNew.size
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var txtCommodityName: TextView = v.findViewById(R.id.txtCommodityName)
        var txtDistrictName: TextView = v.findViewById(R.id.txtDistrictName)
        var txtStateName: TextView = v.findViewById(R.id.txtStateName)
        var txtMin_pricerName: TextView = v.findViewById(R.id.txtMin_pricerName)
        var txtMax_pricerName: TextView = v.findViewById(R.id.txtMax_pricerName)
        var txtModal_pricerName: TextView = v.findViewById(R.id.txtModal_pricerName)
        fun bindItems(auth: RecordsItem?) {
            if (auth != null) {
                txtCommodityName.text = auth.commodity
                txtDistrictName.text = auth.district
                txtStateName.text = auth.state
                txtMin_pricerName.text = auth.minPrice + " ₹"
                txtMax_pricerName.text = auth.maxPrice + " ₹"
                txtModal_pricerName.text = auth.modalPrice + " ₹"

            }
        }
    }


}