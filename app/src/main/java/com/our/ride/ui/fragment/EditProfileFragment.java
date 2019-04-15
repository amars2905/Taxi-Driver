package com.our.ride.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.our.ride.R;
import com.our.ride.utils.BaseFragment;

import static com.our.ride.ui.MainHomeActivity.tvEditProfile;

public class EditProfileFragment extends BaseFragment {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_edit_profile, container, false);
        init();
        return rootView;
    }

    private void init() {
        tvEditProfile.setVisibility(View.VISIBLE);
    }
}
