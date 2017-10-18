package com.jpventura.reactiveapplication.main;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jpventura.reactiveapplication.R;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment implements MainContract.View, View.OnClickListener {

    private FloatingActionButton mFab;
    private MainContract.Presenter mPresenter;

    public MainFragment() {
    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.fab) {
            showMessage();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

//        mFab = root.findViewById(R.id.fab);
//        mFab.setOnClickListener(this);

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Override
    public void onStop() {
        mPresenter.unsubscribe();
        super.onStop();
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    @Override
    public void showMessage() {
        final String msg = "Replace with your own action";
        Snackbar.make(mFab, msg, Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }

}
