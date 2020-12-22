package com.emrecagri.taksiuygulamasitasarimi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KartEkle extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.kart_ekle);

        Button btn_kart_ekle = findViewById(R.id.btn_kart_ekle);

        btn_kart_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentislemi = new Intent(KartEkle.this, OdemeVePuanlama.class);


                startActivity(intentislemi);
            } });


    }
}