package lzy.com.baseadapter.adapter;


import com.zhy.adapter.recyclerview.base.ItemViewDelegateDataBinding;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import javax.inject.Inject;

import lzy.com.baseadapter.R;
import lzy.com.baseadapter.bean.MessageBean;
import lzy.com.baseadapter.databinding.ItemMessageBinding;


/**
 * Created by lizhiyun on 2017/11/6.
 */

public class MessageItemViewDelegate extends ItemViewDelegateDataBinding<MessageBean,ItemMessageBinding> {
    @Inject
    public MessageItemViewDelegate() {
        super(R.layout.item_message);
    }

    @Override
    public void convertDataBinding(ViewHolder<ItemMessageBinding> holder, MessageBean messageBean, int position) {
        holder.getBinding().setMessage(messageBean);
    }
}
