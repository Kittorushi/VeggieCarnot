

package com.veggie.android.simpeldesa.di

import com.veggie.android.simpeldesa.repository.VeggieRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { VeggieRepository(get()) }
}