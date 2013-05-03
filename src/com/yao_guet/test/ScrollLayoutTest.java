package com.yao_guet.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class ScrollLayoutTest extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WALLPAPER); 
        
        ScrollLayout ScrollLayoutTest = (ScrollLayout)findViewById(R.id.ScrollLayoutTest);
    }
}