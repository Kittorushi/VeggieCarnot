
package com.veggie.android.simpeldesa.di

import com.veggie.android.simpeldesa.api.requests.VeggieServices
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single(createdAtStart = false) { get<Retrofit>().create(VeggieServices::class.java) }
}