package caixa;

import impressao.Impressora;
import pagamento.Cartao;
import pagamento.Operadora;

public class Checkout {
    //Finalizar a compra pós ela ser autorizada
    //pelo cartão. Ela vai ter um método de fechar
    //a compra, que vai receber uma compra e um cartão.

    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public Operadora getOperadora() {
        return operadora;
    }
    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }
    public Impressora getImpressora() {
        return impressora;
    }
    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao) {
        boolean autorizado = this.operadora.autorizar(compra, cartao);
        if (autorizado){
            this.impressora.imprimir(compra);
        }
        else {
            System.out.println("Compra Não Autorizada");
        }
    }
    /*
    Se autorizado, eu posso imprimir um documento imorimivel (algume q segue o contrato)
    Como compra tem implementação da interface imprimivel, eu
    tbm posso passar "compra" como documento imprimivel
    */
}
