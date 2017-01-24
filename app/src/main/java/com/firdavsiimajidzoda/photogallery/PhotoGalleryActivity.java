package com.firdavsiimajidzoda.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by firdavsiimajidzoda on 1/18/17.
 */

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
