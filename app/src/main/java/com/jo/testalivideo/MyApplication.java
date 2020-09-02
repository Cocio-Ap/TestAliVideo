package com.jo.testalivideo;

import android.app.Application;

import com.aliyun.common.httpfinal.QupaiHttpFinal;
import com.aliyun.svideo.downloader.DownloaderManager;

/**
 * Created by atian
 * on 2020/9/2
 * describe:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        QupaiHttpFinal.getInstance().initOkHttpFinal();
        DownloaderManager.getInstance().init(this);
    }
}
