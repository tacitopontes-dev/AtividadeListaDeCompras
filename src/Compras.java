public class Compras {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Compras(String nome, double preco) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s Valor: %.2f %n",this.getNome(), this.getPreco());
    }



}
