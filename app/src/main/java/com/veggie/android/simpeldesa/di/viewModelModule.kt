
package com.veggie.android.simpeldesa.di


import com.veggie.android.simpeldesa.ui.home.HomeViewModel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}

