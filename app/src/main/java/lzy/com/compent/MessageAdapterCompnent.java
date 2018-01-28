package lzy.com.compent;

import dagger.Component;
import lzy.com.baseadapter.adapter.MessageAdapter;

/**
 * Created by lizhiyun on 2017/11/6.
 */

@Component
public interface MessageAdapterCompnent {
    void inject(MessageAdapter messageAdapter);
}
