package com.taxi.taxidriver.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.taxi.taxidriver.R;
import com.taxi.taxidriver.constant.Constant;
import com.taxi.taxidriver.retrofit_provider.RetrofitService;
import com.taxi.taxidriver.ui.MainHomeActivity;
import com.taxi.taxidriver.utils.BaseFragment;
import com.taxi.taxidriver.utils.ConnectionDirector;

import static com.taxi.taxidriver.ui.activity.LoginActivity.loginfragmentManager;


public class LoginFragment extends BaseFragment implements View.OnClickListener {
    private View rootview;
    private String strEmail, strPassword;
    private EditText et_login_email, et_login_password;
    private String strEmailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private TextView tvSignUp, tv_forgot_password,tvSignIn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_login_layout, container, false);
        activity = getActivity();
        mContext = getActivity();
        init();
        return rootview;
    }

    private void init() {
        tvSignIn = rootview.findViewById(R.id.tvSignIn);
        tvSignUp = rootview.findViewById(R.id.tvSignUp);
        tv_forgot_password = rootview.findViewById(R.id.tv_forgot_password);
        tvSignIn.setOnClickListener(this);
        tvSignUp.setOnClickListener(this);
        tv_forgot_password.setOnClickListener(this);
    }

    private void startFragment(String tag, Fragment fragment) {
        loginfragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.right_enter, R.anim.left_out)
                .replace(R.id.login_frame, fragment, tag).commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvSignIn:
                startActivity(new Intent(mContext, MainHomeActivity.class));
                break;
            case R.id.tvSignUp:
                startFragment(Constant.SignUpFragment, new SignUpFragment());
                break;
        }

    }
}
