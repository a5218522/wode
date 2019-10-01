package com.example.administrator.yanggeproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class guanzhu extends Activity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guanzh);
        imageView=(ImageView)findViewById(R.id.finish);
    }
    public void finish(View v){
        finish();
    }

}
