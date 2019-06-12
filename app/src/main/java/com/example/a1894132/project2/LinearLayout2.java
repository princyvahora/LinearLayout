package com.example.a1894132.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearLayout2 extends AppCompatActivity {

    String uname, upass;
    TextView txt_nm, txt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout2);


        Bundle bundle = getIntent().getExtras();
        uname = bundle.getString("un");
        upass = bundle.getString("ps");

      /* Intent i = getIntent();

       uname = i.getStringExtra("un");
       upass = i.getStringExtra("ps");*/

        txt_nm = findViewById(R.id.txt_uname);
        txt_pass = findViewById(R.id.txt_upass);

        txt_nm.setText(uname);
        txt_pass.setText(upass);
    }
}
