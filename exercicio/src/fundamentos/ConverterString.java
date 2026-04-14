package fundamentos;

import javax.swing.*;

public class ConverterString {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double soma = num1 + num2;
        System.out.printf("O valor da soma é: %.2f", soma);
        System.out.printf("\nA média é %.2f", soma / 2);
    }
}
