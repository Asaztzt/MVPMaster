package com.example.zhoutao.mvpmaster.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by zhoutao on 2018/11/16.
 */

public class BasePresenter<T>{
    //1.view层的引用
    protected WeakReference<T> myView;


    //3.对view进行绑定和解绑
    //进行绑定
    public void attachView(T view) {
        myView = new WeakReference<T>(view);
    }

    //进行解绑
    public void detachView() {
        myView.clear();
    }

}
