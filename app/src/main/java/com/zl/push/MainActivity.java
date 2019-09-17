package com.zl.push;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CameraHelper cameraHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SurfaceView surfaceView = findViewById(R.id.surfaceView);
        cameraHelper = new CameraHelper(this, Camera.CameraInfo.CAMERA_FACING_BACK, 480, 800);
        cameraHelper.setPreviewDisplay(surfaceView.getHolder());
    }


    public void switchCamera(View view) {
        cameraHelper.switchCamera();
    }

    public void startLive(View view) {
    }

    public void stopLive(View view) {
    }
}
