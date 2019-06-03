package com.umu.component.applike;

import com.luojilab.component.componentlib.applicationlike.IApplicationLike;
import com.luojilab.component.componentlib.applicationlike.RegisterCompManual;
import com.luojilab.component.componentlib.router.ui.UIRouter;

/**
 * 作者：wjh on 2019-05-28 11:39
 */
@RegisterCompManual
public class HoseAppLike implements IApplicationLike {
    UIRouter uiRouter = UIRouter.getInstance();

    @Override
    public void onCreate() {
        uiRouter.registerUI("host");
    }

    @Override
    public void onStop() {
        uiRouter.unregisterUI("host");
    }
}
