package com.apetrescu.mvvmproject.home;

import com.apetrescu.mvvmproject.model.TemperatureData;

/**
 * Created by apetrescu on 10/24/2017.
 */

public interface MainActivityContract {
    public interface Presenter {
        void onShowData(TemperatureData temperatureData);

        void onOpenSettings();
    }

    public interface View {
        void showData(TemperatureData temperatureData);

        void openSettings();
    }
}
