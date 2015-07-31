package com.support.android.designlibdemo;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Custom data bindings.
 * Created by Jacob Ras on 31-7-2015.
 */
public class BindingUtils {
    public static final String TAG = BindingUtils.class.getSimpleName();

    @BindingAdapter({"bind:imageResource"})
    public static void loadImageFromResource(ImageView view, int imageResource) {
        Log.d(TAG, "Loading image from resource #" + imageResource);
        Glide.with(view.getContext()).load(imageResource).centerCrop().into(view);
    }
}