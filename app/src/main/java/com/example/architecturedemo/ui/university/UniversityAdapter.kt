package com.example.architecturedemo.ui.university

import com.example.architecturedemo.R
import com.example.architecturedemo.ui.utils.base.ViewOnClickListener
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseBindingRVModel
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseBindingViewHolder
import com.example.architecturedemo.ui.utils.base.recyclerview.BaseViewHolderBindingFactory
import androidx.databinding.ViewDataBinding
import com.example.architecturedemo.BR
import com.example.architecturedemo.domain.model.university.UniversityUiModel

/**
 * This class contains a factory method
 *
 */
class UniversityVHFactory : BaseViewHolderBindingFactory() {

    /**
     * Factory method to create corresponding ViewHolder for item view in a Recyclerview
     *
     * @param binding binding for the view
     * @param viewType view id
     * @param viewClickCallback callback for click in item view
     * @return View holder for item view
     */
    override fun create(
        binding: ViewDataBinding,
        viewType: Int,
        viewClickCallback: ViewOnClickListener?
    ): BaseBindingViewHolder<out BaseBindingRVModel> {
        return when (viewType) {
            R.layout.item_university -> UniversityViewHolder(binding, viewClickCallback)

            else -> BaseBindingViewHolder(binding)
        }
    }
}

/**
 *This is a view holder for item in a recyclerview
 *
 * @property viewClickCallback A callback for view click
 *
 * @param binding A binding for view
 */
class UniversityViewHolder(
    binding: ViewDataBinding,
    private val viewClickCallback: ViewOnClickListener?
) : BaseBindingViewHolder<UniversityRVModel>(binding) {
    override fun bindView(model: UniversityRVModel) {
    }
}

/**
 * Wrapper class for item which contains model for it
 *
 * @property universityUiModel Model for item view
 */
class UniversityRVModel(val universityUiModel: UniversityUiModel) :
    BaseBindingRVModel {

    override fun getLayoutId(): Int {
        return R.layout.item_university
    }

    override fun getBindingPairs(): List<Pair<Int, Any>> {
        return listOf(Pair(BR.uiModel, universityUiModel))
    }
}
