package lzy.com.compent;

import dagger.Component;
import lzy.com.baseadapter.MainActivity;

/**
 * Created by lizhiyun on 2017/11/6.
 */

@Component
public interface MainActivityrCompnent {
    void inject(MainActivity messageActivity);
}
