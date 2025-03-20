import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         
        System.out.println("------- Confidencial -------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu primeiro nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o nome da agência:");
        String agencia = scanner.next();

        float saldo = 0.0f;

        System.out.println("------- Dados Cadastrados -------");

        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + " obrigado por confiar em nossos serviços." );
        System.out.println("* Agência: " + agencia);
        System.out.println("* Conta: " + numero);
        System.out.println("* Saldo: " + saldo);
        System.out.println("Sua conta está ativa e disponível para realizar transações.");

        System.out.println("------- Operação Finalizada -------");
    }
}
