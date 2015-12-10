package br.net.getinfo.cidades.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.net.getinfo.cidades.R;
import br.net.getinfo.cidades.adapter.MyAdapter;
import br.net.getinfo.cidades.model.CidadeModel;

public class CidadeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidades);
        List<CidadeModel> listaCidades = new ArrayList<>();
        listaCidades.add(new CidadeModel("Aracaju", R.drawable.aracaju));
        listaCidades.add(new CidadeModel("Caninde", R.drawable.caninde));
        listaCidades.add(new CidadeModel("Estancia", R.drawable.estancia));
        listaCidades.add(new CidadeModel("Itabaiana", R.drawable.itabaiana));
        listaCidades.add(new CidadeModel("Laranjeiras", R.drawable.laranjeiras));
        listaCidades.add(new CidadeModel("Propriá", R.drawable.propria));
        listaCidades.add(new CidadeModel("São Cristóvão", R.drawable.saocristovao));
        MyAdapter myAdapter = new MyAdapter(listaCidades,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this.getApplicationContext());
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(llm);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(myAdapter);
    }
}
