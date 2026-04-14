package fundamentos;

import java.util.Scanner;
import java.math.*;

public class CalcularQuadradoCubo {
    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);

        System.out.print("Digite um valor para que seja elevado ao Quadrado e ao Cubo: ");
        double valor = objTeclado.nextDouble();

        objTeclado.close();

        double quad = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.printf("O valor %.1f elevado ao Quadrado é %.1f e ao cubo é %.1f", valor, quad, cubo);
    }
}
