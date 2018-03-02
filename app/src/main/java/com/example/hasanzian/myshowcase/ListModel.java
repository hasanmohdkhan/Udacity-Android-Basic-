package com.example.hasanzian.myshowcase;

/**
 * Created by hasanZian on 02-03-2018.
 */

public class ListModel {
   private String mProjectTitle;
   private String mProjectInfo;
   private int mImageResourcesID;


    public ListModel(String mProjectTitle, String mProjectInfo, int mImageResourcesID) {
        this.mProjectTitle = mProjectTitle;
        this.mProjectInfo = mProjectInfo;
        this.mImageResourcesID = mImageResourcesID;
    }

    public String getmProjectTitle() {
        return mProjectTitle;
    }

    public String getmProjectInfo() {
        return mProjectInfo;
    }

    public int getmImageResourcesID() {
        return mImageResourcesID;
    }
}
