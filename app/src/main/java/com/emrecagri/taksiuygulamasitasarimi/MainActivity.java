package com.emrecagri.taksiuygulamasitasarimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn_sms_dogrulama_gonder = findViewById(R.id.btn_sms_dogrulama_gonder);

        btn_sms_dogrulama_gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentislemi = new Intent(MainActivity.this, SmsDogrulama.class);


                startActivity(intentislemi);
            } });


    }
}