import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta = 0;
        String contaAgencia, nomeCliente;
        double saldoConta = 0.0;

        try (Scanner terminalInput = new Scanner(System.in)) {
            System.out.println("Olá, Seja bem vindo ao Banco dos Sonhos!");
            System.out.println("\nPara continuar efetue o cadastro:");

            System.out.println("> Digite o nome completo: ");
            nomeCliente = terminalInput.nextLine();
            
            System.out.println("> Digite o número da conta: ");
            numeroConta = terminalInput.nextInt();
            
            System.out.println("> Digite a agência bancária, ex.: [XXXX] [X]");
            contaAgencia = String.format("%d-%d", terminalInput.nextInt(), terminalInput.nextInt());

            System.out.println("> Quando deseja depositar? ");
            saldoConta = terminalInput.nextDouble();
        }

        System.out.printf("\nOlá %s, obrigado por criar uma conta no nosso banco. ", nomeCliente);
        System.out.printf("\nConta: %d, Agência: %s.", numeroConta, contaAgencia);
        System.out.printf("\nSeu saldo disponível é de R$ %.2f.", saldoConta);
    }
}
