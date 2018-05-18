package com.apetrescu.mvvmproject.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.graphics.drawable.Drawable;

import com.apetrescu.mvvmproject.BR;

/**
 * Created by apetrescu on 10/24/2017.
 */

public class TemperatureData extends BaseObservable {
    private Drawable imgRes;
    private String degrees;
    private String location;

    public TemperatureData(String degrees, String location, Drawable imgRes) {
        this.imgRes = imgRes;
        this.degrees = degrees;
        this.location = location;
    }

    @Bindable
    public Drawable getImgRes() {
        return imgRes;
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    @Bindable
    public String getDegrees() {
        return degrees;
    }

    public void setImgRes(Drawable imgRes) {
        this.imgRes = imgRes;
        notifyPropertyChanged(BR.imgRes);
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
        notifyPropertyChanged(BR.degrees);
    }
}
