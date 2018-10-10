package com.drive.manager;

import android.content.Context;

import com.drive.utilty.Contextor;

public class URLManager {

    private static URLManager inInstace;

    public static URLManager getInInstace(){
        if (inInstace == null){
            inInstace = new URLManager();
        }
        return inInstace;
    }

    private String url;
    private Context mContext;

    private URLManager() {

        mContext = Contextor.getInstance().getContext();

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
