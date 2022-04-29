package com.example.architecturedemo.ui.university

import android.app.Application
import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.architecturedemo.domain.usecase.university.GetUniversityListUseCase
import com.example.architecturedemo.ui.utils.base.viewmodel.BaseViewModel
import com.example.architecturedemo.ui.utils.dispatcher.DispatcherProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UniversityViewModel @Inject constructor(
    application: Application,
    private val getUniversityListUseCase: GetUniversityListUseCase,
    private val dispatcherProvider: DispatcherProvider
)
    : BaseViewModel(application) {

    init {
        getUniversityList()
    }

    private val _viewState: MutableStateFlow<UniversityViewState> =
        MutableStateFlow(UniversityViewState())
    val viewState: StateFlow<UniversityViewState> = _viewState

    fun getUniversityList() {
        viewModelScope.launch(dispatcherProvider.io) {
            val result = getUniversityListUseCase.getUniversityList("United States")
            if (result.isSuccess) {
                Log.d("apple", "hai")
                val res = result.getOrElse {
                    emptyList()
                }


            } else {
                Log.d("apple", "nai hai")
            }
        }
    }
}