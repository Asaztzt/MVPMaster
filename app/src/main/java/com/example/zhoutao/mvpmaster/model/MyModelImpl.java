package com.example.zhoutao.mvpmaster.model;

import java.util.ArrayList;
import java.util.List;

/**
 * model层的实现类
 */

public class MyModelImpl implements MyModel {

    @Override
    public void loadData(OnLoadListner onLoadListner) {
        List<String> data = new ArrayList<>();
        data.add("数据1");
        data.add("数据2");
        data.add("数据3");
        onLoadListner.onCompalte(data);
    }
}
