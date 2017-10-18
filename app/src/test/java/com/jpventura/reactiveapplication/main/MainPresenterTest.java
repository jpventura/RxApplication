package com.jpventura.reactiveapplication.main;

import com.google.common.collect.Lists;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainPresenterTest {

    private MainPresenter mPresenter;

    @Mock
    private MainContract.View mView;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createPresenterAndSetToView() {
        mPresenter = new MainPresenter(mView);
        when(mView.isActive()).thenReturn(true);
    }

    @Test
    public void showMessage() {
        mPresenter = new MainPresenter(mView);
        mPresenter.showMessage();
    }

    @After
    public void tearDown() throws Exception {
    }

}