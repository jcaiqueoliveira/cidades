package br.net.getinfo.cidades.model;

/**
 * Created by caique on 10/12/2015.
 */
public class CidadeModel {
    private int imagemCidade;
    private String nomeCidade;
    public CidadeModel(String nomeCidade,int imagemCidade){
        this.nomeCidade = nomeCidade;
        this.imagemCidade = imagemCidade;
    }
    public int getImagemCidade() {
        return imagemCidade;
    }

    public void setImagemCidade(int imagemCidade) {
        this.imagemCidade = imagemCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
