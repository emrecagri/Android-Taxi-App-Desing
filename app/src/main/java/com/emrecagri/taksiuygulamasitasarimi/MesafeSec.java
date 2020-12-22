package com.emrecagri.taksiuygulamasitasarimi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.MapView;

public class MesafeSec extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mesafe_sec);

        Button btn_taksi_cagir = findViewById(R.id.btn_taksi_cagir);
        MapView mapView = findViewById(R.id.mapView);



        btn_taksi_cagir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentislemi = new Intent(MesafeSec.this, KartEkle.class);


                startActivity(intentislemi);
            } });


    }
}
