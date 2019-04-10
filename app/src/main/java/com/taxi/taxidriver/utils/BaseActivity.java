package com.taxi.taxidriver.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.taxi.taxidriver.R;
import com.taxi.taxidriver.retrofit_provider.RetrofitApiClient;
import com.taxi.taxidriver.retrofit_provider.RetrofitService;


public class BaseActivity extends AppCompatActivity {
    public Context mContext;
    public ConnectionDirector cd;
    public RetrofitApiClient retrofitApiClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        mContext = this;
 /*       cd = new ConnectionDirector(mContext);
        retrofitApiClient = RetrofitService.getRetrofit();*/
    }
}
