package com.umu.componentshare.applike;

import com.luojilab.component.componentlib.applicationlike.IApplicationLike;
import com.luojilab.component.componentlib.applicationlike.RegisterCompManual;
import com.luojilab.component.componentlib.router.ui.UIRouter;

/**
 * Created by mrzhang on 2017/6/15.
 */
@RegisterCompManual
public class ShareApplike implements IApplicationLike {

    UIRouter uiRouter = UIRouter.getInstance();

    @Override
    public void onCreate() {
        uiRouter.registerUI("share");
    }

    @Override
    public void onStop() {
        uiRouter.unregisterUI("share");
    }
}
