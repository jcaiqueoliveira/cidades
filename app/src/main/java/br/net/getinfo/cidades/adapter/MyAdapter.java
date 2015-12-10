package br.net.getinfo.cidades.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.net.getinfo.cidades.R;
import br.net.getinfo.cidades.activity.DetalheCidade;
import br.net.getinfo.cidades.model.CidadeModel;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<CidadeModel> cidade;
    Context c;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ImageView mImageView;
        public CardView mCardView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.title);
            mImageView = (ImageView) v.findViewById(R.id.imagemCidade);
            mCardView = (CardView) v.findViewById(R.id.cv);
            mCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), DetalheCidade.class);
                    intent.putExtra("PosicaoClicada",(int)v.getTag());
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
    public MyAdapter(List<CidadeModel> cidade, Context c) {
        this.cidade = cidade;
        this.c = c;
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        /* referenciando o layout criado */
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_card_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mCardView.setTag(position);
        holder.mTextView.setText(cidade.get(position).getNomeCidade());
        holder.mImageView.setImageDrawable(ContextCompat.getDrawable(c,cidade.get(position).getImagemCidade()));
       // holder.mImageView.setImageResource(R.drawable.propria1);
    }
    @Override
    public int getItemCount() {
        return cidade.size();
    }
}