package com.example.digitaltasbih;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.digitaltasbih.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button buttonAdd, buttonSub, buttonReset;
    int count = 0;
    AlertDialog.Builder countReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
//        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);
        countReset = new AlertDialog.Builder(this);

        //===============================================================
        // onClick event here
        buttonAdd.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //count = count + 1;

            count++;
            tvCount.setText((""+count));
            }
        }));

//        buttonSub.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(count != 0) {
//                    count--;
//                    tvCount.setText((""+count));
//                }
//
//            }
//        }));

//        buttonReset.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                count=0;
//                tvCount.setText((""+count));
//            }
//        }));

        buttonReset.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                countReset.setTitle("Alert!!")
                        .setMessage("Do you want to reset?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                count=0;
                                tvCount.setText((""+count));
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .show();
            }
        }));

    }

}