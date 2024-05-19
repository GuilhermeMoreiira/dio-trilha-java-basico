import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criando um novo scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float saldo = 237.48f;

        System.out.println("Olá, qual é seu nome?");
        String nome = scanner.next();

        System.out.println("Por favor digite  número da sua agência!");
        String agencia = scanner.next();

        System.out.println("Por favor digite  número da sua conta!");
        int conta = scanner.nextInt();

        System.out.println(
            "Olá " + nome + "," + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + conta + " e o seu saldo de " + "R$" + saldo + " já está disponivel para saque!"
        );
    }
}
