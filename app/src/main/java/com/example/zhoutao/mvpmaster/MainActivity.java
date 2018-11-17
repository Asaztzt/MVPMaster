package com.example.zhoutao.mvpmaster;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhoutao.mvpmaster.presenter.ShowPresenter;
import com.example.zhoutao.mvpmaster.view.BaseActivity;
import com.example.zhoutao.mvpmaster.view.MyView;

import java.util.List;

public class MainActivity extends BaseActivity<MyView,ShowPresenter<MyView>> implements MyView {
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                presenter.fetch();
            }
        });
    }

    @Override
    protected ShowPresenter<MyView> createPresenter() {
        return new ShowPresenter<>();
    }

    @Override
    public void showNum(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            stringBuilder = stringBuilder.append(strings.get(i));
        }
        tv.setText(stringBuilder.toString());
    }

    @Override
    public void showLoading() {
        Toast.makeText(MainActivity.this, "加载成功", Toast.LENGTH_LONG).show();
    }
}
