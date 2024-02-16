import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia,nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();

        System.err.println("Por favor, digite o nome da Agência !");
        agencia = scanner.next();

        System.err.println("Por favor, digite o seu nome !");
        nomeCliente = scanner.next();

        System.err.println("Por favor, digite o seu saldo !");
        saldo = scanner.nextDouble();

        System.err.println("Olá "+nomeCliente+", obrigado por criar um conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque !");
    }
}
