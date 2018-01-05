package test.scan.cgm.com.cgmscantestandroid.app;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.StrictMode;

import net.doo.snap.ScanbotSDKInitializer;

/**
 * Created on 1/4/2018.
 */

public class DemoApp extends Application {

    private final String licenseKey =
            "MIlacbvpA3InZaHWrMVVgEQjXd3fLv" +
                    "NRCG/sqXsQh8YK1KljwFYNdiba0N5L" +
                    "RKVjgIfzjiwKfiI+slp9S+5a99cJAd" +
                    "iCu5azyXzml82jmbblsssg+pr7x2Xc" +
                    "jAry23Jl4ZH6QJSjZADzTAJ1rRfZIW" +
                    "S7MKQqzmNZ+/WqxLo3vSgkTtRcnXGU" +
                    "BCwpB+meCmUkLsKbRUn0UVpGD4i60M" +
                    "L/gjTewgb7U/uF54u0+1nHO/yghX2f" +
                    "KkHLzleFhRsNwR5sxdAZsOlmj+Vq8W" +
                    "p1eM5CKRm7a60vRNidmSh0d3920Y+9" +
                    "81p8vCYMOHTO7s/V2qX0AFVRAZ7vrP" +
                    "n6uXNS3jNtyw==\nU2NhbmJvdFNESw" +
                    "pjb20uY2dtLnNjYW4udGVzdAoxNTE2" +
                    "NTc5MTk5Cjk0CjI=\n";

    @Override
    public void onCreate() {
        super.onCreate();
        new ScanbotSDKInitializer()
                .license(this, licenseKey)
                .initialize(this);
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity a, Bundle savedInstanceState) {
                a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });

    }
}
