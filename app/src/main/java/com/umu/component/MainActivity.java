package com.umu.component;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.luojilab.component.componentlib.router.Router;
import com.umu.componentservice.readerbook.ReadBookService;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onView();
    }

    private void onView(){
        findViewById(R.id.tv_content).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment();
            }
        });
        findViewById(R.id.tv_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment();
            }
        });
    }

    private void showFragment(){
        if (fragment != null) {
            ft = getSupportFragmentManager().beginTransaction();
            ft.remove(fragment).commit();
            fragment = null;
        }

        Router router = Router.getInstance();
        if (router.getService(ReadBookService.class.getSimpleName()) != null) {
            ReadBookService service = (ReadBookService) router.getService(ReadBookService.class.getSimpleName());
            fragment = service.getReadBookFragment();
            ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.tab_content, fragment).commitAllowingStateLoss();
        }
    }
}
