package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        double num1;
        double num2;
        String operacao;

        Scanner objTeclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = Double.parseDouble(objTeclado.next());

        System.out.print("Digite o segundo número: ");
        num2 = Double.parseDouble(objTeclado.next());

        System.out.print("Digite a sua operação (+, -, /, *, %): ");
        operacao = objTeclado.next();

        double soma = num1 + num2;
        double subtacao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double restoDivisao = num1 % num2;

        double resultado = operacao.equals("+")
                ? soma : operacao.equals("-")
                ? subtacao : operacao.equals("*")
                ? multiplicacao : operacao.equals("/")
                ? divisao : restoDivisao;

        objTeclado.close();

        System.out.printf("O resultado da operação foi: %.2f", resultado);
    }
}
