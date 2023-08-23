package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        ed1 = findViewById(R.id.txtamt);


        String[] from = {"USD","Indian Rupees","SriLankan Rupees","Euro","Chinese Yuan","Japanese Yen","Swiss Franc","Brazilian Real","Hong Kong Dollar","Chilean Peso","Turkish lira","Indonesian Rupiah","Bangladeshi Taka"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"USD","Indian Rupees","SriLankan Rupees","Euro","Chinese Yuan","Japanese Yen","Swiss Franc","Brazilian Real","Hong Kong Dollar","Chilean Peso","Turkish lira","Indonesian Rupiah","Bangladeshi Taka"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt * 70.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt * 179.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 70.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() =="Indian Rupees" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt * 3.91;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 179.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() =="SriLankan Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 3.91;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 0.92;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 0.92;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt * 7.20;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 7.20;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt * 146.04;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 146.04;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt * 0.88;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 0.88;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 4.98;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 4.98;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 7.84;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 7.84;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 869.53;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 869.53;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 27.20 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 27.20;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 15327.00 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 15327.00;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 109.44;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt / 109.44;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                             ////// INR to other currency///////

                if(sp1.getSelectedItem().toString() == "" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt *0.011 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "")
                {
                    tot = amt / 0.011;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt * 0.087;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 0.087;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt * 1.76;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 1.76;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt * 0.011;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 0.011;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 0.060;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 0.060;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 0.094;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 0.094;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 10.48 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 10.48;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 0.33  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 0.33;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 184.66  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 184.66;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 1.32;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt / 1.32;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                                ////////////////// SLC TO OTHERS//////////
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt *0.0028 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.0028;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt * 0.0022;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.0022;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt * 0.45;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.45;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt * 0.0027;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.0027;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 0.015;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.015;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 0.024;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.024;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 2.68 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 2.68;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 0.084  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.084;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 47.17  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 47.17;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "SriLankan Rupees" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 0.34;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "SriLankan Rupees")
                {
                    tot = amt / 0.34;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }


                               ////EURO TO OTHERS////

                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt * 7.95;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 7.95;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt * 158.81;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 158.81;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt * 0.96;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 0.96;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 5.43;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 5.43;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 8.54;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 8.54;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 947.48 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 947.48;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 29.65  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 29.65;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 16706.90  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 16706.90;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 119.30;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt / 119.30;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                                       ///////CY TO OTHERS rest/////
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt * 19.97;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 19.97;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt * 0.12;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 0.12;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 0.68;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 0.68;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 1.07;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 1.07;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 119.21;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 119.21;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 3.78  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 3.78;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 2101.14  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 2101.14;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chinese Yuan" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 15;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Chinese Yuan")
                {
                    tot = amt / 15;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                                    ///JPY to rest////
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt * 0.0060;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 0.0060;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 0.034101;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 0.034101;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 0.054;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 0.054;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 5.97;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 5.97;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 0.19  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 0.19;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 105.26  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 105.26;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Japanese Yen" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 0.75;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amt / 0.75;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                                    ////////SF TO REST///
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 5.68;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt / 5.68;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 8.94;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt / 8.94;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 991.86;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt / 991.86;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 31.03  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt / 31.03;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 17482.49  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt / 17482.49;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Swiss Franc" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 124.83;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Swiss Franc")
                {
                    tot = amt / 124.83;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                          ///////////////////////blr to other///////////////

                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 1.57;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt / 1.57;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 174.59 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt / 174.59;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 5.46  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt / 5.46;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 3077.35  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt / 3077.35;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Brazilian Real" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 21.98;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Brazilian Real")
                {
                    tot = amt / 21.98;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }


                                     ////// hkd to others/////

                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 110.94 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt / 110.94;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 3.47  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt / 3.47;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 1955.27  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt / 1955.27;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Hong Kong Dollar" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 13.96 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Hong Kong Dollar")
                {
                    tot = amt / 13.96;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                                               ////////CP to rest////
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 0.031 ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt / 0.031;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 17.62  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt / 17.62;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Chilean Peso" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 0.13  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Chilean Peso")
                {
                    tot = amt / 0.13;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                              //////TURKISH LIRA  TO REST/////
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 563.48  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt / 563.48;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Turkish lira" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 4.02  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Turkish lira")
                {
                    tot = amt / 4.02;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                                            //////INDONESIAN RUPIAH TO REST///

                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Indonesian Rupiah" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 0.0071  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Indonesian Rupiah")
                {
                    tot = amt / 0.0071;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }


                                                 /////BANGLADESH TAKA TO OTHERS///

                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt * 1  ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Bangladeshi Taka" && sp2.getSelectedItem().toString() == "Bangladeshi Taka")
                {
                    tot = amt / 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }


























































            }
        });
    }
}