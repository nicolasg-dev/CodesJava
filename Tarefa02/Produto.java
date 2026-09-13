public class Produto {
    String descricao;
    double precoUnitario;
    int estoque;

    String getDescricao() {
        return descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    double getPrecoUnitario() {
        return precoUnitario;
    }

    void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    int getEstoque() {
        return estoque;
    }

    void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    double efetuarVenda(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque = estoque - quantidade;
            return quantidade * precoUnitario;
        }

        return 0.0;
    }
}
