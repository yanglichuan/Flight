package com.uandme.flight.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import com.uandme.flight.FlightApplication;
import com.uandme.flight.network.MoccApi;
import com.uandme.flight.util.LogUtil;

/**
 * Created by QingYang on 15/7/19.
 */
public class BaseFragment extends Fragment {
    protected String TAG = BaseFragment.class.getSimpleName();

    @Override public void onCreate(Bundle savedInstanceState) {
        LogUtil.LOGD(TAG, "onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override public void onViewCreated(View view, Bundle savedInstanceState) {
        LogUtil.LOGD(TAG, "onViewCreated()");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override public void onActivityCreated(Bundle savedInstanceState) {
        LogUtil.LOGD(TAG, "onCreate()");
        super.onActivityCreated(savedInstanceState);
    }

    @Override public void onStart() {
        LogUtil.LOGD(TAG, "onStart()");
        super.onStart();
    }

    @Override public void onResume() {
        LogUtil.LOGD(TAG, "onResume()");
        super.onResume();
    }

    @Override public void onPause() {
        LogUtil.LOGD(TAG, "onPause()");
        super.onPause();
    }

    @Override public void onStop() {
        LogUtil.LOGD(TAG, "onStop()");
        super.onStop();
    }

    @Override public void onDestroyView() {
        LogUtil.LOGD(TAG, "onDestroyView()");
        super.onDestroyView();
    }

    @Override public void onDestroy() {
        LogUtil.LOGD(TAG, "onDestroy()");
        super.onDestroy();
    }

    public MoccApi getMoccApi() {
        return FlightApplication.getMoccApi();
    }
}