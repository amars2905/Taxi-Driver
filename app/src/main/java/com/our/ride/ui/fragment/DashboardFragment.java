package com.our.ride.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.our.ride.R;
import com.our.ride.constant.Constant;
import com.our.ride.utils.BaseFragment;

import org.w3c.dom.Text;

import static com.our.ride.ui.MainHomeActivity.fragmentUtils;
import static com.our.ride.ui.MainHomeActivity.toolbar;
import static com.our.ride.ui.MainHomeActivity.tvEditProfile;

public class DashboardFragment extends BaseFragment implements View.OnClickListener {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);
        tvEditProfile.setVisibility(View.GONE);
        init();
        return rootView;
    }

    private void init() {
        ((TextView) rootView.findViewById(R.id.tvResumerideRequest)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvResumerideRequest:
                toolbar.setTitle("Role");
                fragmentUtils.replaceFragment(new RoleFragment(), Constant.RoleFragment, R.id.main_frame);
                break;
        }
    }
}
//            fragmentUtils.replaceFragment(new RoleFragment(), Constant.RoleFragment, R.id.main_frame);