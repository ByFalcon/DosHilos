package com.example.dam.doshilos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button btDo;
    private android.widget.TextView tvTexto1;
    private android.widget.TextView tcTexto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        this.tcTexto2 = findViewById(R.id.tcTexto2);
        this.tvTexto1 = findViewById(R.id.tvTexto1);
        this.btDo = findViewById(R.id.btDo);

        this.btDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
