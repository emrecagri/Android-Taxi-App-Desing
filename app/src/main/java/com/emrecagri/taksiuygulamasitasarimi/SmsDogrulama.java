package com.emrecagri.taksiuygulamasitasarimi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SmsDogrulama extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sms_dogrulama);

        Button btn_sms_dogrulama_kontrol = findViewById(R.id.btn_sms_dogrulama_kontrol);

        btn_sms_dogrulama_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentislemi = new Intent(SmsDogrulama.this, MesafeSec.class);


                startActivity(intentislemi);
            } });


    }
}
