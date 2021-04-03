package org.nsh.aldiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view){
        //gambar Hospital di click
        Intent i = new Intent(this,Hospital.class);
        startActivity(i);
    }

    public void clickPolice(View view){
        //gambar Police di click
        Intent i = new Intent(this,Police.class);
        startActivity(i);
    }

    public void clickSupermarket(View view){
        //gambar Supermarket di click
        Intent i = new Intent(this,Supermarket.class);
        startActivity(i);
    }

    public void clickSchool(View view){
        //gambar Supermarket di click
        Intent i = new Intent(this,School.class);
        startActivity(i);
    }
}