package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected  static final double XP_PADRAO = 10;
    protected  String titutlo;
    protected String descricao;

    public abstract double calcularXP();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descriçao) {
        this.descricao = descriçao;
    }
}
