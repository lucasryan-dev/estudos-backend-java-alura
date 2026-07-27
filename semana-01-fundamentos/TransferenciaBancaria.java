import java.util.Scanner;

public class TransferenciaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "LUCAS RYAN";
        String conta = "CORRENTE";
        int escolha = 0;
        double saldo1 = 3000.00;

        System.out.println("--------------------------------------------------------------");
        System.out.println("                    DADOS DOS CLIENTES                        ");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da conta: " + conta);
        System.out.println("Saldo da conta: " + saldo1);
        System.out.println("\n-------------------------------------------------------------");

        while (escolha != 4) {
            System.out.println("OPERACOES");
            System.out.println("1- Consultar Saldo ");
            System.out.println("2- Receber Valor ");
            System.out.println("3- Transferir Valor");
            System.out.println("4- Sair");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Saldo: " + saldo1);
            } else if (escolha == 2) {
                System.out.println("Informe o Valor que ira receber: ");
                double receber = scanner.nextDouble();
                saldo1 += receber;
                System.out.println("Saldo Atualizado: " + saldo1);
            } else if (escolha == 3) {
                System.out.println("Informe o Valor que ira Transferir: ");
                double trans = scanner.nextDouble();
                if (trans > saldo1) {
                    System.out.println("Nao ha saldo suficiente para fazer a transferencia ");
                } else {
                    saldo1 -= trans;
                    System.out.println("Saldo Atualizado: " + saldo1);
                }
            } else if (escolha == 4) {
                System.out.println("ENCERRANDO...");
            } else {
                System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE!");
            }
        }

        scanner.close();
    }
}