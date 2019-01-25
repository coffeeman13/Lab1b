package com.concordia.cejv669.lab1b;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtNum1 = findViewById(R.id.txtNum1);
                EditText txtNum2 = findViewById(R.id.txtNum2);
                TextView lblResult = findViewById(R.id.lblResult);

                double result = Double.valueOf(txtNum1.getText().toString()) + Double.valueOf(txtNum2.getText().toString());

                lblResult.setText(String.valueOf(result));

                

                InputMethodManager imm =
                        (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

            }
        });
    }

}
