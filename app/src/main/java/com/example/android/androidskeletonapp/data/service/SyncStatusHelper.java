package com.example.android.androidskeletonapp.data.service;

import com.example.android.androidskeletonapp.data.Sdk;

import org.hisp.dhis.android.core.D2;
import org.hisp.dhis.android.core.d2manager.D2Manager;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SyncStatusHelper {

    // TODO implement count methods

    public static int programCount() {
        return Sdk.d2().programModule().programs.count();
    }

    public static int dataSetCount() {
        return 0;
    }

    public static int trackedEntityInstanceCount() {
        return 0;
    }

    public static int singleEventCount() {
        return 0;
    }

    public static int dataValueCount() {
        return 0;
    }
}
