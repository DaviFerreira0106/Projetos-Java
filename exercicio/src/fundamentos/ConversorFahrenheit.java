package fundamentos;

import java.util.Scanner;

public class ConversorFahrenheit {
    public static void main(String[] main) {
        Scanner objTeclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double c = objTeclado.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.printf("A temperatura %.2f convertida em Fahrenheit é %.2f", c, f);

        objTeclado.close();
    }
}
