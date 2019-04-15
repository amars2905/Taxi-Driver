package com.our.ride.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.our.ride.R;
import com.our.ride.constant.Constant;
import com.our.ride.ui.fragment.LoginFragment;

public class LoginActivity extends AppCompatActivity {
    public static FragmentManager loginfragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        if (savedInstanceState == null) {
            loginfragmentManager = getSupportFragmentManager();
            loginfragmentManager.beginTransaction()
                    .replace(R.id.login_frame, new LoginFragment()
                            , Constant.LoginFragment).commit();
        }
        replaceFragment();
    }

    private void replaceFragment() {
        loginfragmentManager = getSupportFragmentManager();
        loginfragmentManager.beginTransaction()
                .replace(R.id.login_frame, new LoginFragment()
                        , Constant.LoginFragment).commit();
    }


    public void onBackPressed() {

        Fragment Login_Password = loginfragmentManager.findFragmentByTag(Constant.LoginFragment);
        Fragment SignUp_Fragment = loginfragmentManager.findFragmentByTag(Constant.SignUpFragment);

        if (SignUp_Fragment != null)
            replaceFragment();
        else if (Login_Password != null)
            replaceFragment();
        else
            super.onBackPressed();
    }

}
