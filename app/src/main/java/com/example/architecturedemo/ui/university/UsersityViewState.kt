package com.example.architecturedemo.ui.university

import androidx.lifecycle.MutableLiveData
import com.example.architecturedemo.domain.model.university.UniversityUiModel
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseBindingRVModel

data class UniversityViewState(
    val state: State = State.Initial,
    val rvUniversityList: MutableLiveData<List<BaseBindingRVModel>> = MutableLiveData(emptyList()),
)

sealed class State {
    object Initial: State()
    data class Success(val universityList: List<UniversityUiModel>): State()
    object Error: State()
}