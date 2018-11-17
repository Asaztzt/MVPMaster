package com.example.zhoutao.mvpmaster.presenter;

import com.example.zhoutao.mvpmaster.model.MyModel;
import com.example.zhoutao.mvpmaster.model.MyModelImpl;
import com.example.zhoutao.mvpmaster.view.MyView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 表示层
 */

public class ShowPresenter<T extends MyView> extends BasePresenter<T>{


    //2.model层的引用
    MyModel myModel = new MyModelImpl();



    //4.执行操作
    public void fetch() {
        if (myView.get() != null) {
            if (myModel != null) {
                myModel.loadData(new MyModel.OnLoadListner() {
                    @Override
                    public void onCompalte(List<String> data) {
                        if (myView.get() != null) {
                            myView.get().showLoading();
                            myView.get().showNum(data);
                        }
                    }
                });
            }
        }
    }

}
