package com.example.moni;

import android.app.Application;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class App  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoader.getInstance().init(
                new ImageLoaderConfiguration.Builder(this)
                        .memoryCacheSizePercentage(10)
                        .discCacheSize(50 * 1024 * 1024)
                        .defaultDisplayImageOptions(
                                new DisplayImageOptions.Builder()
                                        .showImageOnFail(R.mipmap.ic_launcher)
                                        .showImageOnLoading(R.mipmap.ic_launcher)
                                        .cacheInMemory(true)
                                        .cacheOnDisk(true)
                                        .build()
                        )
                        .build()
        );

    }
}
