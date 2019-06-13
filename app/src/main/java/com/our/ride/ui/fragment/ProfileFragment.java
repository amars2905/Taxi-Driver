package com.our.ride.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.our.ride.R;
import com.our.ride.constant.Constant;
import com.our.ride.ui.activity.ChangePasswordActivity;
import com.our.ride.utils.BaseFragment;

import static com.our.ride.ui.MainHomeActivity.fragmentUtils;
import static com.our.ride.ui.MainHomeActivity.toolbar;
import static com.our.ride.ui.MainHomeActivity.tvEditProfile;

public class ProfileFragment extends BaseFragment implements View.OnClickListener {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        mContext = getActivity();
        init();
        return rootView;
    }

    private void init() {
        tvEditProfile.setVisibility(View.VISIBLE);
        ((TextView) rootView.findViewById(R.id.tvChangePassword)).setOnClickListener(this);
        //   tvEditProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvChangePassword:
                startActivity(new Intent(mContext, ChangePasswordActivity.class));
                break;
        }

    }
}
