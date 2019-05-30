package com.umu.componentreader.applike;

import com.luojilab.component.componentlib.applicationlike.IApplicationLike;
import com.luojilab.component.componentlib.applicationlike.RegisterCompManual;
import com.luojilab.component.componentlib.router.Router;
import com.luojilab.component.componentlib.router.ui.UIRouter;
import com.umu.componentreader.impl.ReaderBookServiceImpl;
import com.umu.componentservice.readerbook.ReadBookService;

/**
 * 作者：wjh on 2019-05-28 11:39
 */
@RegisterCompManual
public class ReaderAppLike implements IApplicationLike {
    Router router = Router.getInstance();
    UIRouter uiRouter = UIRouter.getInstance();

    @Override
    public void onCreate() {
        uiRouter.registerUI("reader");
        router.addService(ReadBookService.class.getSimpleName(), new ReaderBookServiceImpl());
    }

    @Override
    public void onStop() {
        uiRouter.unregisterUI("reader");
        router.removeService(ReadBookService.class.getSimpleName());
    }
}
