
package com.veggie.android.simpeldesa.repository

import com.veggie.android.simpeldesa.api.requests.VeggieServices

class VeggieRepository(private val veggieServices: VeggieServices) {
    suspend fun repoGetListVeggie(baseUrl: String) = veggieServices.listVeggie(baseUrl)
    suspend fun repoGetFilteredListVeggie(baseUrl: String, selectedFromList: String) = veggieServices.listFilterVeggie(baseUrl, mandiName = selectedFromList)
}