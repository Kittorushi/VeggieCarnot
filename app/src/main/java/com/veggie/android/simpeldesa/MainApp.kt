

package com.veggie.android.simpeldesa

import android.app.Application
import com.veggie.android.simpeldesa.di.RetrofitModule
import com.veggie.android.simpeldesa.di.apiModule
import com.veggie.android.simpeldesa.di.repositoryModule
import com.veggie.android.simpeldesa.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class MainApp : Application() {
    companion object {
        lateinit var instance: MainApp
            private set
    }
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MainApp)
            modules(listOf(
                //databaseModule,
                viewModelModule,
                apiModule,
                repositoryModule,
                RetrofitModule
            ))

        }
        instance = this
    }
}