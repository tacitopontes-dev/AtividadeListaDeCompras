import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> listaCompras;
    private double valorGasto;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }

    public boolean novaCompra(Compras compra){
        if (this.saldo > compra.getPreco()){
            this.saldo -= compra.getPreco();
            this.valorGasto+= compra.getPreco();
            this.listaCompras.add(compra);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public List<Compras> getCompras(){
        return listaCompras;
    }
}
