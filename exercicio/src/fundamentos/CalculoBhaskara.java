package fundamentos;

import java.util.Scanner;
import java.math.*;

public class CalculoBhaskara {
    public static void main(String[] args){
        Scanner objTeclado = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro coeficiente: ");
        double a = objTeclado.nextDouble();
        
        System.out.print("Digite o valor do segundo coeficiente: ");
        double b = objTeclado.nextDouble();

        System.out.print("Digite o valor do terceira coeficiente: ");
        double c = objTeclado.nextDouble();

        objTeclado.close();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.printf("X1 = %.1f \nX2 = %.1f", x1, x2);
    }
}
