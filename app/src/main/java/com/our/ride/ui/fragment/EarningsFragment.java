package com.our.ride.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.our.ride.R;
import com.our.ride.constant.Constant;
import com.our.ride.utils.BaseFragment;

import static com.our.ride.ui.MainHomeActivity.fragmentUtils;
import static com.our.ride.ui.MainHomeActivity.toolbar;
import static com.our.ride.ui.MainHomeActivity.tvEditProfile;

public class EarningsFragment extends BaseFragment implements View.OnClickListener {
    private View rootView;
    private String[] date = {"Date"};
    private String[] time = {"Time"};
    private ArrayAdapter dateAdapter, timeAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_earnings, container, false);
        mContext = getContext();
        tvEditProfile.setVisibility(View.GONE);
        init();
        return rootView;
    }

    private void init() {
        Spinner spnDate = rootView.findViewById(R.id.spnDate);
        Spinner spnTime = rootView.findViewById(R.id.spnTime);

        dateAdapter = new ArrayAdapter(mContext, R.layout.row_spn, date);
        spnDate.setAdapter(dateAdapter);
        spnDate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        dateAdapter.notifyDataSetChanged();

        timeAdapter = new ArrayAdapter(mContext, R.layout.row_spn, time);
        spnTime.setAdapter(timeAdapter);
        spnTime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        timeAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
//            fragmentUtils.replaceFragment(new RoleFragment(), Constant.RoleFragment, R.id.main_frame);