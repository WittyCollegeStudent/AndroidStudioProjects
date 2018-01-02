package com.example.weianyang.myapplication;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private Button button;
    private ImageView imageView;
    private TextView textView;
    private int cntClick = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageview);
        textView = (TextView) findViewById(R.id.textview);
        button.setOnClickListener(MainActivity.this);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                setInfoImgAndShow();
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.backup:
                Toast.makeText(MainActivity.this,"You clicked Backup",Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.delete:
                Toast.makeText(MainActivity.this,"You clicked Delete",Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.settings:
                Toast.makeText(MainActivity.this,"You clicked Settings",Toast.LENGTH_SHORT)
                        .show();
                break;
            default:break;
        }
        return true;
    }

    public void setInfoImgAndShow() {
        String desc = "This is a describtion.";
        switch (cntClick) {
            case 0:
                imageView.setImageResource(R.drawable.mango);
                textView.setVisibility(View.VISIBLE);//显示文字
                imageView.setVisibility(View.VISIBLE);//显示图片
                button.setText("再点击一下");
                break;
            case 1:
                imageView.setImageResource(R.drawable.banana);
                break;
            case 2:
                imageView.setImageResource(R.drawable.cherry);
                break;
            case 3:
                imageView.setImageResource(R.drawable.grape);
                Log.d(TAG, "setInfoImgAndShow: show grape image");
                break;
            default:
                break;
        }
        if(cntClick < 3){
            cntClick = cntClick + 1;
        }
        else
            button.setVisibility(View.GONE);
        Log.d(TAG, "setInfoImgAndShow: "+"cntClick = " + cntClick + ",imagevisibility:" + (imageView.getVisibility()));
        textView.setText(desc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "onCreateOptionsMenu: ");
        getMenuInflater().inflate(R.menu.toobar, menu);
        return true;
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: ");
        super.onRestart();
    }
}
