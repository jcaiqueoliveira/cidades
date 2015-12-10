package br.net.getinfo.cidades.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.net.getinfo.cidades.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
getSupportActionBar().hide();
        /* espera 2 segundos para ir para a próxima activity */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* intent indicando qual de qual e para qual activity iremos */
                Intent intent = new Intent(SplashActivity.this, CidadeActivity.class);
                /* startactivity solicita uma intent para saber o que deve fazer */
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
