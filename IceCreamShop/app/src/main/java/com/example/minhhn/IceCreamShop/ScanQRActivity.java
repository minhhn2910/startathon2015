package com.example.minhhn.IceCreamShop;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import com.example.minhhn.creamshop.R;

public class ScanQRActivity extends ActionBarActivity {
    Camera camera;
    Context context = this;
    private SurfaceView surface_view;
    private Camera mCamera;
    SurfaceHolder.Callback sh_ob = null;
    SurfaceHolder surface_holder        = null;
    SurfaceHolder.Callback sh_callback  = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);
        SurfaceView surface_view = (SurfaceView)findViewById(R.id.surfaceView);

        //surface_view = new SurfaceView(getApplicationContext());
       // addContentView(surface_view, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));

        if (surface_holder == null) {
            surface_holder = surface_view.getHolder();
        }

        sh_callback = my_callback();
        surface_holder.addCallback(sh_callback);

        final Button btn_qr = (Button) findViewById(R.id.btn_surfaceView);
        btn_qr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        , AfterOrderActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });

    }
    SurfaceHolder.Callback my_callback() {
        SurfaceHolder.Callback ob1 = new SurfaceHolder.Callback() {

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                mCamera.stopPreview();
                mCamera.release();
                mCamera = null;
            }

            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                mCamera = Camera.open();
                mCamera.setDisplayOrientation(90);
                Camera.Parameters params= mCamera.getParameters();
                params.set("jpeg-quality", 72);
                params.set("rotation", 90);
                params.set("orientation", "portrait");
              //  params.setPictureFormat(PixelFormat.JPEG);
                mCamera.setParameters(params);
                try {
                    mCamera.setPreviewDisplay(holder);
                } catch (Exception exception) {
                    mCamera.release();
                    mCamera = null;
                }
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width,
                                       int height) {
                mCamera.startPreview();
            }
        };
        return ob1;
    }

}
