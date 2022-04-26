package com.example.architecturedemo.ui.utils.base.recyclerview

import androidx.databinding.ViewDataBinding
import com.example.architecturedemo.ui.utils.base.ViewOnClickListener

abstract class BaseViewHolderBindingFactory {
    abstract fun create(
        binding: ViewDataBinding,
        viewType: Int,
        viewClickCallback: ViewOnClickListener?
    ): BaseBindingViewHolder<out BaseBindingRVModel>
}
