
package com.veggie.android.simpeldesa.api.requests

import com.veggie.android.simpeldesa.api.models.veggie.VegiModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface VeggieServices {

    @Headers("Accept: application/json","Content-Type: application/json")
    @GET("9ef84268-d588-465a-a308-a864a43d0070")
    suspend fun  listFilterVeggie(
        @Query("api-key") API_KEY :String,
        @Query("offset") paging :Int = 0,
        @Query("limit") limit :Int = 40,
        @Query("filters[state]") mandiName:String
    ): VegiModel


    @Headers("Accept: application/json","Content-Type: application/json")
    @GET("9ef84268-d588-465a-a308-a864a43d0070")
    suspend fun listVeggie(
        @Query("api-key") API_KEY :String,
        @Query("offset") paging :Int = 0,
        @Query("limit") limit :Int = 40
    ): VegiModel
}