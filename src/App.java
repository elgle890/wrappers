import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        @SuppressWarnings("removal")
        double numero = new Double(scanner.nextDouble());
        System.out.println("esse é o numero" + numero);

    }
}
