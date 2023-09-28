import java.util.Scanner;

// By Lucsxt

public class desafio {
    public static void main(String[] args) {
        String nome = "Sandro lucas";
        String tipoConta = "Corrente";
        Double saldo = 3000.00;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                \n** Digite sua opção **
                1- Consultar saldo
                2- Transferir valor
                3- Depositar valor
                4- Sair

                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            
            if(opcao == 1){
                System.out.println("\nO Saldo atualizado é: " + saldo);
            } else if (opcao == 2){
                System.out.println("\nQual valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("\nNão há saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("\nNovo saldo: " + saldo);
                }
            } else if (opcao == 3) {
            System.out.println("\nValor recebido: ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("\nNovo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("\nOpção invalida");
            }
        }   
    }
}
