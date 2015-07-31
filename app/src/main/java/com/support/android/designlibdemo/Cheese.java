package com.support.android.designlibdemo;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Cheese data object.
 * Created by Jacob Ras on 30-7-2015.
 */
public class Cheese extends BaseObservable {
    public final ObservableField<String> info = new ObservableField<>();
    public final String friends;
    public final String related;

    public Cheese(String info, String friends, String related) {
        this.info.set(info);
        this.friends = friends;
        this.related = related;
    }
}