package com.umu.componentshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.luojilab.router.facade.annotation.Autowired;
import com.luojilab.router.facade.annotation.RouteNode;
import com.umu.baseres.BaseActivity;

@RouteNode(path = "/share/edit/book", desc = "分享页")
public class ShareActivity extends BaseActivity {

    @Autowired
    String bookName;

    @Autowired
    String author;

    private TextView textView;
    private String content = "content";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_activity_share);

        Intent intent = getIntent();
//        Bundle bundle = intent.getExtras();
//        content = new StringBuilder().append(bundle.getString("bookName")).append(bundle.getString("author")).toString();

//        content = bookName + author;

        onView();
    }

    private void onView() {
        textView = findViewById(R.id.tv_content);
        textView.setText(content);
    }


}
