package pagamento;

public interface Autorizacao {
    // Só preciso saber o valor total da compra, para
    // ela ser autorizável ou não
    public double getValorCompra();
}