
package br.com.cupoms.entities;


public class Cupom extends Entitie{
    private int id;
    private int codCupom;
    private String descricao;
    private int numPontos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodCupom() {
        return codCupom;
    }

    public void setCodCupom(int codCupom) {
        this.codCupom = codCupom;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumPontos() {
        return numPontos;
    }

    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }
    
    
}
