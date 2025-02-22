import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();

        System.out.println("Informe sua agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, informe seu nome!");
        String nome = scanner.next();

        System.out.println("Informe o seu saldo atual:");
        Float saldo = scanner.nextFloat();



        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agencia é: "+agencia);
        System.out.println("Conta: "+numero+", e seu saldo de: "+saldo+" ja esta disponivel para saque");
       
    }
}
