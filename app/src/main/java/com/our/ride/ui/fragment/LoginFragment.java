package com.our.ride.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.our.ride.R;
import com.our.ride.constant.Constant;
import com.our.ride.ui.MainHomeActivity;
import com.our.ride.utils.BaseFragment;

import static com.our.ride.ui.activity.LoginActivity.loginfragmentManager;


public class LoginFragment extends BaseFragment implements View.OnClickListener {
    private View rootview;
    private TextView tvSignUp,tvSignIn;
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
        tvSignIn.setOnClickListener(this);
        tvSignUp.setOnClickListener(this);
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
