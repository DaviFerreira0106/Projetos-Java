package fundamentos;

import java.util.Scanner;

public class AreaTrangulo {
    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);

        System.out.print("Digite a altura do triângulo: ");
        double altura = objTeclado.nextDouble();

        System.out.print("Digite o valor da base do triângulo: ");
        double base = objTeclado.nextDouble();

        objTeclado.close();

        double area = (altura * base) / 2;

        System.out.printf("A área desse triângulo é %.1f", area);
    }
}
