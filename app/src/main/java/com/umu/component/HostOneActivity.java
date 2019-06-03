package com.umu.component;

import android.content.Intent;
import android.os.Bundle;

import com.luojilab.router.facade.annotation.RouteNode;
import com.umu.baseres.BaseActivity;

/**
 * 作者：wjh on 2019-06-03 10:49
 */
@RouteNode(path = "/host/one", desc = "主工程测试页")
public class HostOneActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hose_activity_one);

        Intent intent = getIntent();
//        Bundle bundle = intent.getExtras();
//        content = new StringBuilder().append(bundle.getString("bookName")).append(bundle.getString("author")).toString();

//        content = bookName + author;

    }


}
