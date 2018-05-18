package com.apetrescu.mvvmproject.home;

import android.content.Context;

import com.apetrescu.mvvmproject.model.TemperatureData;

/**
 * Created by apetrescu on 10/24/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;
    private Context mContext;

    public MainActivityPresenter(MainActivityContract.View view, Context context) {
        this.view = view;
        this.mContext = context;
    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }

    @Override
    public void onOpenSettings() {
        view.openSettings();
    }
}
