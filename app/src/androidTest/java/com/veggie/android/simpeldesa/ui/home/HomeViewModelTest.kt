

package com.veggie.android.simpeldesa.ui.home

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.veggie.android.simpeldesa.MainApp
import com.veggie.android.simpeldesa.api.models.veggie.VegiModel
import com.veggie.android.simpeldesa.api.requests.VeggieServices
import com.veggie.android.simpeldesa.di.apiModule
import com.veggie.android.simpeldesa.di.repositoryModule
import com.veggie.android.simpeldesa.repository.VeggieRepository
import org.junit.Assert.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.logger.Level
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.inject


@RunWith(AndroidJUnit4::class)
class HomeViewModelTest:KoinTest {



    val model by inject<HomeViewModel>()

//
//    @get:Rule
//    val koinTestRule = KoinTestRule.create {
//        printLogger(Level.DEBUG)
//        modules(repositoryModule,apiModule)
//    }
//
//    @Test
//    fun whenAPICalled() {
//        model.vmGetListVeggie()
//    }
}