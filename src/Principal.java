import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Scanner;



public class Principal {
    public static void limparTela (){
        for (int i = 0; i < 50; i++)
            System.out.println();
    }
    static void main() {
        Scanner scaner = new Scanner(System.in);
        double limite = 0;
        int opcao = 1;
        String nome;
        double valor;
        boolean compraRealizada;


        System.out.println("Digite o limite do cartão: ");
        limite = scaner.nextDouble();
        scaner.nextLine();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        while (opcao != 0){
            System.out.println("Nome do Produto: ");
            nome = scaner.nextLine();
            System.out.println("Valor do produto: ");
            valor = scaner.nextDouble();
            scaner.nextLine();
            Compras compra = new Compras(nome,valor);
            compraRealizada = cartao.novaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra Realziada !");
                System.out.println("Digite 1 para nova compra ou digite 0 para sair");
                opcao = scaner.nextInt();
                scaner.nextLine();
            }else {
                System.out.println("Saldo insuficiente");
                System.out.println("Digite 1 para tentar novamente ou 0 para sair: ");
                opcao = scaner.nextInt();
                scaner.nextLine();
            }

        }
        limparTela();



        cartao.getCompras().sort(Comparator.comparing(Compras::getPreco));
        System.out.println("Compras Finalizadas");
        System.out.printf("Saldo restante: %.2f %n", cartao.getSaldo());

        for (Compras compras : cartao.getCompras()){
            System.out.println(compras);
        }
        System.out.printf("Valor total Gasto: %.2f %n", cartao.getValorGasto());




    }
}
