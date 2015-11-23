package com.example.Project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by g00284823 on 22/10/2015.
 */
public class activity2 extends Activity {

    ToggleButton togBtn;
    Button btnMainMenu;
    Button btnRoom1;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity2);
            txt1 = (TextView) findViewById(R.id.textView2);
            txt2 = (TextView) findViewById(R.id.textView3);
            txt3 = (TextView) findViewById(R.id.textView4);
            txt4 = (TextView) findViewById(R.id.textView5);
            txt5 = (TextView) findViewById(R.id.textView6);
            txt6 = (TextView) findViewById(R.id.textView7);
            togBtn = (ToggleButton) findViewById(R.id.toggleButton);
            btnMainMenu = (Button) findViewById(R.id.btnMainMenu);
            btnRoom1 = (Button) findViewById(R.id.btnRoom1);
        }
        catch(Exception e){
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
    public void goToRoom1(View v)
    {
        try {
            Intent i = new Intent(activity2.this, activity1.class);
            startActivity(i);
        }
        catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(),
                    Toast.LENGTH_LONG).show();
        }
    }
    public void goToMain(View v)
    {
        finish();
    }
}