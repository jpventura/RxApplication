package com.jpventura.reactiveapplication.main;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mView;

    public MainPresenter(@NonNull MainContract.View view) {
        mView = checkNotNull(view);
        mView.setPresenter(this);
    }

    @Override
    public void showMessage() {

    }

    @Override
    public void subscribe() {
    }

    @Override
    public void unsubscribe() {
    }

}
