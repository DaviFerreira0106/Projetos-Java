package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua altura: ");
        double altura = objTeclado.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = objTeclado.nextDouble();

        objTeclado.close();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC (Índice de Massa Corporal) é %.2f.", imc);
    }
}
