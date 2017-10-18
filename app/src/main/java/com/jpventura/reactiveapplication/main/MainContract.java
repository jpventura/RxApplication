package com.jpventura.reactiveapplication.main;

import android.support.annotation.NonNull;

import com.jpventura.reactiveapplication.BasePresenter;
import com.jpventura.reactiveapplication.BaseView;

public interface MainContract {

    interface Presenter extends BasePresenter {

        void showMessage();

    }

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showMessage();

    }

}
