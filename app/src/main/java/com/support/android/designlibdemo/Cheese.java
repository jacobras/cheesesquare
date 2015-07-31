package com.support.android.designlibdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Cheese data object.
 * Created by Jacob Ras on 30-7-2015.
 */
public class Cheese extends BaseObservable {
    private      String mInfo;
    public final String friends;
    public final String related;

    public Cheese(String info, String friends, String related) {
        this.mInfo = info;
        this.friends = friends;
        this.related = related;
    }

    @Bindable
    public String getInfo() {
        return mInfo;
    }

    public void setInfo(String info) {
        mInfo = info;
        notifyPropertyChanged(com.support.android.designlibdemo.BR.info);
    }
}