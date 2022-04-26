package com.example.architecturedemo.ui.utils.base

import androidx.databinding.ViewDataBinding
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseBindingRVModel
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseBindingViewHolder
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseRVBindingAdapter
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseViewHolderBindingFactory

open class RVModelBindingAdapter(
    list: List<BaseBindingRVModel>,
    private val viewCB: ViewOnClickListener?,
    private val baseViewHolderFactory: BaseViewHolderBindingFactory
) : BaseRVBindingAdapter<BaseBindingRVModel>(list) {

    override fun getLayoutId(position: Int, obj: BaseBindingRVModel): Int {
        return obj.getLayoutId()
    }

    override fun getViewHolder(
        binding: ViewDataBinding,
        viewType: Int
    ): BaseBindingViewHolder<BaseBindingRVModel> {
        return baseViewHolderFactory.create(
            binding,
            viewType,
            viewCB
        ) as BaseBindingViewHolder<BaseBindingRVModel>
    }
}