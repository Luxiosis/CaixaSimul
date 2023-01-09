package caixa;
import impressao.Imprimivel;
import pagamento.Autorizacao;

public class Compra implements Imprimivel, Autorizacao {
    // Além dos dados de compra do produto, devemos
    // implementar os métodos das duas INTERFACES
    private double valorCompra;
    private String produto;
    private String nomeCliente;
    public double getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String getCabecalhoNF() {
        //Mostrar nome do cliente
        return this.nomeCliente;
    }
    @Override
    public String getCorpoNF() {
        //Mostrar o produto e o valor da compra
        return this.produto + " = " + this.getValorCompra();
    }
}