import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operador) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
                  break;
                default:
                    System.out.println("Operador inválido.");
                    return;
        }
        System.out.println("Resultado: " + result);
    }
}
