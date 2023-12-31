package modelos;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra outroCompra) {
     return Double.valueOf(this.valor).compareTo(Double.valueOf(outroCompra.valor));
    }

    @Override
    public String toString() {
        return '\n' + "Descrição: " + this.getDescricao() + '\n' + "Valor: " + this.getValor();
    }
}
