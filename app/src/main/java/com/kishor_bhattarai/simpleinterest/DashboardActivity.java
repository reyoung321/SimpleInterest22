package com.kishor_bhattarai.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnSI, btnCTF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnSI = findViewById(R.id.btnSI);
        btnCTF = findViewById(R.id.btnCTF);

     btnSI.setOnClickListener(this);
        btnCTF.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.btnSI){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
        }

    }
}
