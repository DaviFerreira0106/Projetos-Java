package fundamentos;

import java.util.Scanner;

public class ConversorCelsius {
    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = objTeclado.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.printf("A temperatura %.2f convertida para Celsius é %.2f.", f, c);

        objTeclado.close();
    }
}
