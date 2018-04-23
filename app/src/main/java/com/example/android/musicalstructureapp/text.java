package com.example.android.musicalstructureapp;

/**
 * Created by Paulina on 3/22/2018.
 */

public class text {
    private String descriptionsArrayListOne;
    private String descriptionsArrayListTwo;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public text(String descriptionOne, String descriptionTwo, int audioResourceId) {
        descriptionsArrayListOne = descriptionOne;
        descriptionsArrayListTwo = descriptionTwo;
        mAudioResourceId = audioResourceId;
    }

    public text(String descriptionOne, String descriptionTwo, int imageResourceId,
                int audioResourceId) {
        descriptionsArrayListOne = descriptionOne;
        descriptionsArrayListTwo = descriptionTwo;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDescription1() {
        return descriptionsArrayListOne;
    }

    public String getDescription2() {
        return descriptionsArrayListTwo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
