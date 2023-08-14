package modelos;

public class Produto implements Comparable<Produto>{
    private String descricao;
    private double valor;
//
//    public Produto(String descricao, double valor) {
//        this.descricao = descricao;
//        this.valor = valor;
//    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        if (this.valor < outroProduto.getValor()) {
            return -1;
        } if (this.valor > outroProduto.getValor()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return '\n' + "Descrição: " + this.getDescricao() + '\n' + "Valor: " + this.getValor();
    }
}
