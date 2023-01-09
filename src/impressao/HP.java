package impressao;

public class HP implements Impressora{

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("*******************");
        System.out.println("Nota Fiscal - Loja XPTO");
        System.out.println(imprimivel.getCabecalhoNF());
        System.out.println(imprimivel.getCorpoNF());
        System.out.println("Impresso na HP");
    }
}
