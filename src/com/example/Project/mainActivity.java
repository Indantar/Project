package com.example.Project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    TextView txtView;
    Button btnRoom1;
    Button btnRoom2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.main);
            txtView = (TextView) findViewById(R.id.textView);
            btnRoom1 = (Button) findViewById(R.id.btnRoom1);
            btnRoom2 = (Button) findViewById(R.id.btnRoom2);
        }
        catch(Exception e)
        {
            Toast.makeText(getBaseContext(),e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
    public void Room1(View v)
    {
        try {
            Intent i = new Intent(mainActivity.this, activity1.class);
            startActivity(i);
        }
        catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(),
                    Toast.LENGTH_LONG).show();
        }
    }
    public void Room2(View v)
    {
        try {
            Intent i2 = new Intent(mainActivity.this, activity2.class);
            startActivity(i2);
        }
        catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(),
                    Toast.LENGTH_LONG).show();
        }
    }
}
