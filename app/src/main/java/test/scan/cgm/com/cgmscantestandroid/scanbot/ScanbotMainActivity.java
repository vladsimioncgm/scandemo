package test.scan.cgm.com.cgmscantestandroid.scanbot;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import test.scan.cgm.com.cgmscantestandroid.R;

public class ScanbotMainActivity extends AppCompatActivity {
    private static final int PERMISSIONS_REQUEST_CAMERA = 314;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scanbot_activity_main);
        findViewById(R.id.show_dialog_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ScanbotMainActivity.this,
                        Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED) {

                    if (ActivityCompat.shouldShowRequestPermissionRationale(ScanbotMainActivity.this,
                            Manifest.permission.CAMERA)) {
                    } else {
                        ActivityCompat.requestPermissions(ScanbotMainActivity.this,
                                new String[]{Manifest.permission.CAMERA},
                                PERMISSIONS_REQUEST_CAMERA);
                    }
                } else {
                    openCameraDialog();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSIONS_REQUEST_CAMERA: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    openCameraDialog();
                }
                return;
            }
        }
    }

    private void openCameraDialog() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create and show the dialog.
        DialogFragment newFragment = CameraDialogFragment.newInstance();
        newFragment.show(ft, "dialog");
    }
}
