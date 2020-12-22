package com.emrecagri.taksiuygulamasitasarimi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OdemeVePuanlama extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.odeme_ve_puanlama);

        Button btn_oyla = findViewById(R.id.btn_oyla);

        btn_oyla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentislemi = new Intent(OdemeVePuanlama.this, MesafeSec.class);


                startActivity(intentislemi);


            } });


    }
}
