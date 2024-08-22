import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next();
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + 
        " já está disponível para saque.";

        // Exibe a mensagem final
        System.out.println(mensagem);
    }
}