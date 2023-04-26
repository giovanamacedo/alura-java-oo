package ModuloUm.DesafioBanco;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        //Inicializar dados do cliente
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        System.out.println("Qual seu tipo de conta? ");
        String tipoConta = entrada.nextLine();
        System.out.println("Digite seu saldo: (Ex. 2500.00) ");
        double saldo = entrada.nextDouble();

        System.out.println("\n***********************\n" +
                           "Dados iniciais do cliente:\n"+
                           "\nNome: " + nome +
                           "\nTipo conta: " + tipoConta +
                           "\nSaldo inicial: " + saldo +
                           "\n***********************");

        //Menu de opções
        int opcao = 0;
        while (opcao != 4){
            System.out.println("\nOperações:\n" +
                    "1 - Consultar saldo\n" +
                    "2 - Receber valor\n" +
                    "3 - Transferir valor\n" +
                    "4 - Sair\n");
            System.out.println("Digite sua opção: ");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("O seu saldo é: R$" + saldo);
                    break;
                //Receber valor
                case 2:
                    System.out.println("Qual é o valor a ser recebido? ");
                    double valorParaReceber = entrada.nextDouble();
                    saldo += valorParaReceber;
                    System.out.println("Você recebeu: " + valorParaReceber + "." +
                                       "\nSeu saldo agora é: " + saldo);
                    break;
                //Enviar valor
                case 3:
                    System.out.println("Qual é o valor a ser transferido? ");
                    double valorTransferencia = entrada.nextDouble();
                    if (valorTransferencia > saldo){
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Você transferiu: " + valorTransferencia + "." +
                                "\nSeu saldo é: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
