package com.currencyconverter.aswin.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view)
    {
        EditText value = (EditText) findViewById(R.id.EditText);
        String valueInRupees = value.getText().toString();

        if(valueInRupees.matches("")||valueInRupees.matches("."))
        {
            Toast.makeText(this, "Enter some value", Toast.LENGTH_SHORT).show();
            return;
        }

        Double valueInRupeesDouble = Double.parseDouble(valueInRupees);
        Double valueInDollarsDouble = valueInRupeesDouble/73.14;

        String valueInDollar = String.format("%.2f",valueInDollarsDouble);

        Toast.makeText(this, valueInRupees+"₹ is "+valueInDollar+"$", Toast.LENGTH_SHORT).show();
    }

    public void buttonClick1(View view)
    {
        EditText value = (EditText) findViewById(R.id.EditText1);
        String valueInDollar = value.getText().toString();

        if(valueInDollar.matches("")||valueInDollar.matches("."))
        {
            Toast.makeText(this, "Enter some value", Toast.LENGTH_SHORT).show();
            return;
        }

        Double valueInDollarDouble = Double.parseDouble(valueInDollar);
        Double valueInRupeesDouble = valueInDollarDouble*73.14;

        String valueInRupees = String.format("%.2f",valueInRupeesDouble);

        Toast.makeText(this, valueInDollar+"$ is "+valueInRupees+"₹", Toast.LENGTH_SHORT).show();
    }
}
