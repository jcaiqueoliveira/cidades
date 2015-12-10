package br.net.getinfo.cidades.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import br.net.getinfo.cidades.R;

public class DetalheCidade extends AppCompatActivity {
    private static  final int ARACAJU = 0;
    private static  final int CANINDE = 1;
    private static  final int ESTANCIA = 2;
    private static  final int ITABAIANA = 3;
    private static  final int LARANJEIRAS = 4;
    private static  final int PROPRIA = 5;
    private static  final int SAO_CRISTOVAO = 6;
    private ImageView imageDetalheCidade;
    private TextView textDetalheCidade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cidade);
        imageDetalheCidade = (ImageView) findViewById(R.id.imgDetalheCidade);
        textDetalheCidade = (TextView) findViewById(R.id.textDetalheCidade);
        int cidadeClicada = this.getIntent().getIntExtra("PosicaoClicada", -1);
        int texto = 0;
        int imgCidade = 0;
        switch (cidadeClicada){
            case ARACAJU:
                texto = R.string.aracaju;
                imgCidade = R.drawable.aracaju;
                break;
            case CANINDE:
                texto = R.string.caninde;
                imgCidade = R.drawable.caninde;
                break;
            case ESTANCIA:
                texto = R.string.estancia;
                imgCidade = R.drawable.estancia;
                break;
            case ITABAIANA:
                texto = R.string.itabaiana;
                imgCidade = R.drawable.itabaiana;
                break;
            case LARANJEIRAS:
                texto = R.string.laranjeiras;
                imgCidade = R.drawable.laranjeiras;
                break;
            case PROPRIA:
                texto = R.string.propria;
                imgCidade = R.drawable.propria;
                break;
            case SAO_CRISTOVAO:
                texto = R.string.saocristovao;
                imgCidade = R.drawable.saocristovao;
                break;
        }
        imageDetalheCidade.setImageResource(imgCidade);
        textDetalheCidade.setText(getResources().getString(texto));
    }
}
