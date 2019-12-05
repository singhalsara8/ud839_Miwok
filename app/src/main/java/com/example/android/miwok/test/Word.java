package com.example.android.miwok.test;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int imageid= -1;
    private int mImageResourceId=imageid;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }
    public boolean hasImage(){
        if(mImageResourceId!=imageid)
            return true;
        else
            return false;
    }
}
