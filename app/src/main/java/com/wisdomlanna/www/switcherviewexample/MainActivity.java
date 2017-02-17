package com.wisdomlanna.www.switcherviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pl.aprilapps.switcher.Switcher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Switcher switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switcher = new Switcher.Builder(this)
                .addContentView(findViewById(R.id.content))
                .addErrorView(findViewById(R.id.error_view))
                .addProgressView(findViewById(R.id.loading_view))
                .addEmptyView(findViewById(R.id.empty_view))
                .build();

        switcher.showProgressView();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btnContent:
                switcher.showContentView();
                break;
            case R.id.btnEmptyData:
                switcher.showEmptyView();
                break;
            case R.id.btnServerError:
                switcher.showErrorView();
                break;
        }
    }
}