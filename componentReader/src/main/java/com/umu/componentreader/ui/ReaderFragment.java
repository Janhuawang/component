package com.umu.componentreader.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.luojilab.component.componentlib.router.ui.UIRouter;
import com.umu.componentreader.R;


public class ReaderFragment extends Fragment implements View.OnClickListener {

    public static ReaderFragment newInstance() {
        return new ReaderFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.bt_a).setOnClickListener(this);
        view.findViewById(R.id.bt_b).setOnClickListener(this);
        view.findViewById(R.id.bt_c).setOnClickListener(this);
        view.findViewById(R.id.bt_d).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_a) {
            Bundle bundle = new Bundle();
            bundle.putString("bookName", "Name");
            bundle.putString("author", "wjh");
            UIRouter.getInstance().openUri(getActivity(), "DDComp://share/share/edit/book", bundle);
            Toast.makeText(this.getContext(), "a", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.bt_b) {
            Toast.makeText(this.getContext(), "b", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.bt_c) {
            Toast.makeText(this.getContext(), "c", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.bt_d) {
            Toast.makeText(this.getContext(), "d", Toast.LENGTH_SHORT).show();
        }
    }
}
