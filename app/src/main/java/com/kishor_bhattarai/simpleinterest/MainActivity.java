package com.kishor_bhattarai.simpleinterest;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etInterest, etTime, etRate;
    private Button btnCalculate;
    float Principle; int Time, Rate, SimpleInterest;
    //TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding

        etInterest = findViewById(R.id.etI);
        etTime = findViewById(R.id.etT);
        etRate = findViewById(R.id.etR);
        btnCalculate =findViewById(R.id.btnCal);
        // result = findViewById(R.id.view_result);

        //listener

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleInterest = Integer.parseInt(etInterest.getText().toString());
                Time = Integer.parseInt(etTime.getText().toString());
                Rate = Integer.parseInt(etRate.getText().toString());
                Principle = SimpleInterest/(Time*Rate);
//output

                Toast.makeText(MainActivity.this, "Principle is "+Principle, Toast.LENGTH_LONG).show();



            }
        });

    }
}