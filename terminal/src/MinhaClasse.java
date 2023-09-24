import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();

            System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos");
        }
    }
}
