import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(" <<< SEJA BEM VINDO AO BANCO TERMINAL >>> \n\n");

        try {
            System.out.println("INSIRA O NÚMERO DA CONTA: ");
            int numeroConta = scanner.nextInt();

            System.out.println("INSIRA A AGÊNCIA: ");
            String agencia = scanner.next();

            System.out.println("INSIRA O SEU NOME:");
            String nome = scanner.next();

            System.out.println("INSIRA O SALDO: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        }catch (Exception e){
            System.out.println("Entrada inválida!");
        }


    }

}
