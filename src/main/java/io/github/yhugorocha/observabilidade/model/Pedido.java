package io.github.yhugorocha.observabilidade.model;

public class Pedido {

    private Long id;
    private String descricao;

    public Pedido() {
    }

    public Pedido(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
