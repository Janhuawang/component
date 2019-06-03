package com.umu.component.application;

import com.luojilab.component.componentlib.router.Router;
import com.umu.baseres.BaseApplication;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
//        ILogger.logger.setDefaultTag("JIMU");
//        UIRouter.enableDebug();

//        EventManager.appendMapper("com.luojilab.componentdemo.application", MainProcessMsgService.class);
//        EventManager.appendMapper("com.luojilab.componentdemo.application:remote", RemoteMsgService.class);
//        EventManager.init(this);

//        UIRouter.getInstance().registerUI("app");

        //如果isRegisterCompoAuto为false，则需要通过反射加载组件
        Router.registerComponent("com.umu.componentreader.applike.ReaderAppLike");
        Router.registerComponent("com.umu.componentshare.applike.ShareApplike");
        Router.registerComponent("com.umu.component.applike.HoseAppLike");

    }

}
