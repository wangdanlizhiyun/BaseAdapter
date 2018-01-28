package lzy.com.baseadapter.adapter;

import android.content.Context;

import com.zhy.adapter.recyclerview.CommenAdapter;

import java.util.List;

import javax.inject.Inject;

import lzy.com.baseadapter.bean.MessageBean;


/**
 * Created by lizhiyun on 2017/11/6.
 */

public class MessageAdapter extends CommenAdapter<MessageBean> {

    public MessageAdapter(Context context, List<MessageBean> datas) {
        super(context, datas);
//        Da.create().inject(this);
    }

    @Inject
    public void addType(MessageItemViewDelegate messageItemViewDelegate){
        addItemViewDelegate(messageItemViewDelegate);
    }
}
