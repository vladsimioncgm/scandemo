package test.scan.cgm.com.cgmscantestandroid.app;

import android.app.Application;
import android.os.StrictMode;

/**
 * Created on 1/4/2018.
 */

public class DemoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
    }
}
