package com.zhy.adapter.recyclerview.base;


/**
 * Created by zhy on 16/6/22.
 */
public abstract class ItemViewDelegate<T>
{

    protected int layoutId;

    public ItemViewDelegate(int layoutId) {
        this.layoutId = layoutId;
    }

    public ItemViewDelegate() {
    }

    public int getItemViewLayoutId(){
        return layoutId;
    }

    public boolean isForViewType(T item, int position){
        return true;
    }

    public abstract void convert(ViewHolder holder, T t, int position);

}
