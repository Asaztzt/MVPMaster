package com.example.zhoutao.mvpmaster.model;

import java.util.List;

/**
 * model层，用来加载数据
 */

public interface MyModel {

    void loadData(OnLoadListner onLoadListner);

    /**
     * 设计一个内部接口，来返回数据
     */

    interface OnLoadListner {
        void onCompalte(List<String> data);
    }

}
