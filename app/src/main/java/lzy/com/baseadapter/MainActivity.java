package lzy.com.baseadapter;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.zhy.adapter.recyclerview.CommenAdapter;
import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.Lazy;
import lzy.com.baseadapter.adapter.MessageAdapter;
import lzy.com.baseadapter.adapter.MessageItemViewDelegate;
import lzy.com.baseadapter.bean.MessageBean;
import lzy.com.baseadapter.databinding.ActivityMainBinding;
import lzy.com.compent.DaggerMainActivityrCompnent;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;
    @Inject
    Lazy<MessageItemViewDelegate> mMessageItemViewDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        getWindow().setBackgroundDrawable(null);
        mBinding.recycle.setLayoutManager(new LinearLayoutManager(this));

        DaggerMainActivityrCompnent.create().inject(this);
        List<MessageBean> list = getMessage();
        //组装adtapter方式，注入局部类型
        mBinding.recycle.setAdapter(new CommenAdapter(this, list)
                .addItemViewDelegate(mMessageItemViewDelegate.get()));
        //定义adapter类方式
        mBinding.recycle.setAdapter(new MessageAdapter(this,list));
//        不自定义itemviewtype类的方式
        mBinding.recycle.setAdapter(new CommenAdapter(this,list)
                .addItemViewDelegate(new ItemViewDelegate<MessageBean>(R.layout.item_message1) {
                    @Override
                    public void convert(ViewHolder holder, MessageBean o, int position) {
//                holder.setText(R.id.tv_message,"dfafafkvhchvadoigehinvn女方你打开 v 短发距离的剧啊绿那位女 i 哦女的的女啊稼女哦那如果你的黑发反对 v 啊多久啊联合发起哦闺女这几个卡都给哈哈嘎：沟发呆发回国 男的女款都翻江倒海发噶吧fdaf放大镜发动发动妇女巴拉诺夫忿 i 勤能补拙"+position);
                        holder.setText(R.id.tv_message,o.getBody());
                    }
                }));
    }
    private List<MessageBean> getMessage(){
        List<MessageBean> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MessageBean bean = new MessageBean();
            bean.setBody("短信内容"+i);
            list.add(bean);
        }
        return list;
    }
}
