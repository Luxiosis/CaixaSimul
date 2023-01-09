/*
Exercício sobre Interafaces:
Simular uma aplicação que simule uma venda de um produto no caixa.
É necessário criar algumas interfaces:
IMPRESSORA,
IMPRIMÍVEL,
OPERADORA,
e AUTORIZAÇÃO.

Crie uma classe CARTÃO para armzenar os dados do cartão,
e uma classe COMPRA para implementar algumas interfaces

A classe CHECKOUT deve fechar a compra, verificando o cartão e a compra
A classe PRINCIPAL deve instanciar o cliente, o produto, valor e realizar o CHECKOUT

Checkout:
// Finalizar a compra após ela ser autorizada pelo cartão
// Ela vai ter um método de fechar a compra, que vai receber uma
// compra e um cartão.
//Para fechar a compra, eu preciso receber uma compra e um cartão, além
//de verificar se ele está autorizado ou não
//Se autorizado, eu posso imprimir um documento imprimível (alguém que
//segue o contrato!) Como compra tem implementação da interface Imprimível,
// eu tbm posso passar "compra" como documento imprimível

*/

package pagamento;
public class Principal {
    public static void main(String[] args) {

    }
}
