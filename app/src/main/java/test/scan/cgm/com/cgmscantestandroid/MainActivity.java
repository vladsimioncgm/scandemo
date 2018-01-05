package test.scan.cgm.com.cgmscantestandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import test.scan.cgm.com.cgmscantestandroid.camscanner.IntsigScanActivity;
import test.scan.cgm.com.cgmscantestandroid.scanbot.ScanbotMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Document Scaner Demo");
        setIntsigScanButton();
        setScanBotButton();
    }



    private void setScanBotButton() {
        findViewById(R.id.scanbot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScanbotMainActivity.class));
            }
        });
    }

    private void setIntsigScanButton() {
        findViewById(R.id.intsig).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IntsigScanActivity.class));
            }
        });
    }


}
