package com.our.ride.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.our.ride.R;
import com.our.ride.constant.Constant;
import com.our.ride.ui.activity.EditProfileActivity;
import com.our.ride.ui.activity.LoginActivity;
import com.our.ride.ui.fragment.DashboardFragment;
import com.our.ride.ui.fragment.EarningsFragment;
import com.our.ride.ui.fragment.HistoryFragment;
import com.our.ride.ui.fragment.ProfileFragment;
import com.our.ride.ui.fragment.RoleFragment;
import com.our.ride.ui.fragment.UpcomingReservationFragment;
import com.our.ride.utils.BaseActivity;
import com.our.ride.utils.FragmentUtils;

public class MainHomeActivity extends BaseActivity
        implements View.OnClickListener {
    public static FragmentManager fragmentManager;
    public static FragmentUtils fragmentUtils;
    public static TextView tvEditProfile;
    public static Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvEditProfile = findViewById(R.id.tvEditProfile);
        tvEditProfile.setVisibility(View.GONE);
        tvEditProfile.setOnClickListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        ((TextView) findViewById(R.id.icResumerideRequests)).setOnClickListener(this);
        ((TextView) findViewById(R.id.icEarnings)).setOnClickListener(this);
        ((TextView) findViewById(R.id.icHistory)).setOnClickListener(this);
        ((TextView) findViewById(R.id.icLogout)).setOnClickListener(this);
        ((TextView) findViewById(R.id.icProfile)).setOnClickListener(this);
        ((TextView) findViewById(R.id.icRole)).setOnClickListener(this);
        ((TextView) findViewById(R.id.icUpcomingReservation)).setOnClickListener(this);
        ((TextView) findViewById(R.id.icWingmanSetting)).setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
        fragmentUtils = new FragmentUtils(fragmentManager);
        toolbar.setTitle("Resume ride requests");
        fragmentUtils.replaceFragment(new DashboardFragment(), Constant.DashboardFragment, R.id.main_frame);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_home, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.icResumerideRequests:
                toolbar.setTitle("Resume ride requests");
                fragmentUtils.replaceFragment(new DashboardFragment(), Constant.DashboardFragment, R.id.main_frame);
                onBackPressed();
                break;
            case R.id.icProfile:
                toolbar.setTitle(Constant.ProfileFragment);
                fragmentUtils.replaceFragment(new ProfileFragment(), Constant.ProfileFragment, R.id.main_frame);
                onBackPressed();
                onBackPressed();
                break;
            case R.id.icRole:
                toolbar.setTitle(Constant.RoleFragment);
                fragmentUtils.replaceFragment(new RoleFragment(), Constant.RoleFragment, R.id.main_frame);
                onBackPressed();
                break;
            case R.id.icHistory:
                toolbar.setTitle(Constant.HistoryFragment);
                fragmentUtils.replaceFragment(new HistoryFragment(), Constant.HistoryFragment, R.id.main_frame);
                onBackPressed();
                break;
            case R.id.icUpcomingReservation:
                toolbar.setTitle("Upcoming Reservations");
                fragmentUtils.replaceFragment(new UpcomingReservationFragment(), Constant.DashboardFragment, R.id.main_frame);
                onBackPressed();
            case R.id.icWingmanSetting:
                toolbar.setTitle("WingMan Setting");
                fragmentUtils.replaceFragment(new DashboardFragment(), Constant.DashboardFragment, R.id.main_frame);
                onBackPressed();
                break;
            case R.id.icEarnings:
                toolbar.setTitle("Earnings");
                fragmentUtils.replaceFragment(new EarningsFragment(), Constant.DashboardFragment, R.id.main_frame);
                onBackPressed();
                break;
            case R.id.icLogout:
                startActivity(new Intent(mContext, LoginActivity.class));
                break;
            case R.id.tvEditProfile:
                startActivity(new Intent(mContext, EditProfileActivity.class));
                break;

        }

    }
}
