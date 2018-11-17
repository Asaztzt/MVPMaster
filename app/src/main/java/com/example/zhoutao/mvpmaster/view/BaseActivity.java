package com.example.zhoutao.mvpmaster.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.zhoutao.mvpmaster.presenter.BasePresenter;

/**
 * Created by zhoutao on 2018/11/16.
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends Activity {
    //表示层的引用
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView((V) this);
    }

     protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    //activity的异常退出
}
