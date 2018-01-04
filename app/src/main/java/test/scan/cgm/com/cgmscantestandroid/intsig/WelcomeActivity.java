package test.scan.cgm.com.cgmscantestandroid.intsig;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import test.scan.cgm.com.cgmscantestandroid.R;

public class WelcomeActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.cui_welcome_activity);
        new Handler().postDelayed(r, 1000);// 1秒后关闭，并跳转到主页面

    }

    Runnable r = new Runnable() {
        @Override
        public void run() {
            // TODO Auto-generated method stub

            Intent intent = new Intent();
            intent.setClass(WelcomeActivity.this, IntsigScanActivity.class);
            startActivity(intent);
            finish();

        }
    };

}
