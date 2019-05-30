package com.umu.componentreader.impl;

import android.support.v4.app.Fragment;

import com.umu.componentreader.ui.ReaderFragment;
import com.umu.componentservice.readerbook.ReadBookService;

/**
 * 作者：wjh on 2019-05-28 11:23
 */
public class ReaderBookServiceImpl implements ReadBookService {
    @Override
    public Fragment getReadBookFragment() {
        return ReaderFragment.newInstance();
    }
}
