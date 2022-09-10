

package com.veggie.android.simpeldesa.ui.home

import androidx.lifecycle.*

import com.veggie.android.simpeldesa.BuildConfig
import com.veggie.android.simpeldesa.api.models.veggie.VegiModel
import com.veggie.android.simpeldesa.repository.VeggieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

class HomeViewModel(private val veggieRepository: VeggieRepository) : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
    val veggieList = MutableLiveData<VegiModel>()
    val veggieFilterList = MutableLiveData<VegiModel>()
    val errorMessage = MutableLiveData<String>()
    fun vmGetListVeggie() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                try {
                    val result = veggieRepository.repoGetListVeggie(BuildConfig.API_KEY)
                    veggieList.postValue(result)
                } catch (throwable: Throwable) {
                    when (throwable) {
                        is IOException -> {
                            errorMessage.postValue("Network Error")
                        }
                        is HttpException -> {
                            val codeError = throwable.code()
                            val errorMessageResponse = throwable.message()
                            errorMessage.postValue("Error $errorMessageResponse : $codeError")
                        }
                        else -> {
                            errorMessage.postValue("Uknown error")
                        }
                    }
                }
            }
        }
    }

    fun vmGetFilterListVeggie (selectedFromList: String) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                try {
                    val result = veggieRepository.repoGetFilteredListVeggie(BuildConfig.API_KEY,  selectedFromList)
                    veggieFilterList.postValue(result)
                } catch (throwable: Throwable) {
                    when (throwable) {
                        is IOException -> {
                            errorMessage.postValue("Network Error")
                        }
                        is HttpException -> {
                            val codeError = throwable.code()
                            val errorMessageResponse = throwable.message()
                            errorMessage.postValue("Error $errorMessageResponse : $codeError")
                        }
                        else -> {
                            errorMessage.postValue("Uknown error")
                        }
                    }
                }
            }
        }
    }


}