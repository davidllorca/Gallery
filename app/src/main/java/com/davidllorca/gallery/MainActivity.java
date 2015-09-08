package com.davidllorca.gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;

/**
 * Created by David Llorca <davidllorcabaron@gmail.com> on 9/8/15.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button galleryBtn = (Button) findViewById(R.id.gallery_btn);
        Button imageViewBtn = (Button) findViewById(R.id.imageSwitcher_btn);
        Button gridViewBtn = (Button) findViewById(R.id.gridView_btn);
        galleryBtn.setOnClickListener(this);
        imageViewBtn.setOnClickListener(this);
        gridViewBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.gallery_btn:
                startActivity(new Intent(this, GalleryActivity.class));
                break;
            case R.id.imageSwitcher_btn:
                startActivity(new Intent(this, ImageSwitcherActivity.class));
                break;
            case R.id.gridView_btn:
                startActivity(new Intent(this, GridViewActivity.class));
                break;
        }
    }

}
