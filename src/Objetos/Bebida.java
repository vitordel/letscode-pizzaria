package Objetos;

import java.math.BigDecimal;

public class Bebida extends Produto{

    public Bebida(String nome, String descricao, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrcao(String descrcao) {
        this.descricao = descrcao;
    }


}


