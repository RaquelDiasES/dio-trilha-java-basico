import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nome, agencia;
        int numero;
        double saldo;

        System.out.println("Por favor, informe o seu nome");
        nome = sc.nextLine();

        System.out.println("Por favor, informe o número da agencia");
        agencia = sc.next();

        System.out.println("Por favor, informe o número da conta");
        numero = sc.nextInt();

        System.out.println("Por favor, informe o seu saldo");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}