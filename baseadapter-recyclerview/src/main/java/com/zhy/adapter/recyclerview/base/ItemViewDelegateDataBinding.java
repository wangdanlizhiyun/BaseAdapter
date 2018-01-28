package com.zhy.adapter.recyclerview.base;


import android.databinding.ViewDataBinding;

/**
 * Created by zhy on 16/6/22.
 */
public abstract class ItemViewDelegateDataBinding<T,B extends ViewDataBinding> extends ItemViewDelegate<T>
{


    public ItemViewDelegateDataBinding(int layoutId) {
        super(layoutId);
    }


    public abstract void convertDataBinding(ViewHolder<B> holder, T t, int position);

    @Override
    public void convert(ViewHolder holder, T t, int position) {

    }
}
