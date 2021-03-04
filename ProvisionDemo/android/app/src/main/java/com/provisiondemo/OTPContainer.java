package com.provisiondemo;

import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class OTPContainer extends ReactContextBaseJavaModule {

    public OTPContainer(@Nullable ReactApplicationContext reactContext) {
        super(reactContext);
    }

    /**
     * @return the name of this module. This will be the name used to {@code require()} this module
     * from javascript.
     */
    @NonNull
    @Override
    public String getName() {
        return "OTPContainer";
    }

//    @ReactMethod
//    public static boolean checkAddDevices() {
//        return true;
//    }

    @ReactMethod
    void createEvent(String message, Callback booleanCallback) {

        booleanCallback.invoke(true);
//        if (OTPContainer.checkAddDevices()) {
//            System.out.println("*****");
//        }
//        if (SharedPreferenceHelper.isRemoteProvisionEnable(getActivity())) {
//        } else if (SharedPreferenceHelper.isFastProvisionEnable(getActivity())) {
//        } else if (SharedPreferenceHelper.isAutoPvEnable(getActivity())) {
//        } else {
//        }

//        if (SharedPreferenceHelper.isRemoteProvisionEnable(getActivity())) {
////        }
    }
}
