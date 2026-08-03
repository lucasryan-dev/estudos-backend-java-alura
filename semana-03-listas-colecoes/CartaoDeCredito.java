import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> compraslist;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compraslist = new ArrayList<>();

    }

    public boolean lancaCompra (Compras compra){
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compraslist.add(compra);
            return true;
        }
        return false;
    }


    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompraslist() {
        return compraslist;
    }
}
