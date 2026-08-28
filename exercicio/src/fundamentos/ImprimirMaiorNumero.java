package fundamentos;
import java.util.Scanner;

public class ImprimirMaiorNumero {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        int maior = 0;

        for(int i = 0; i < 10; i++) {
            System.out.print("\nDigite um número: ");
            int num = objTeclado.nextInt();

            if(num > maior) {
                maior = num;
            }
        }

        System.out.printf("\nO maior Número foi: %d", maior);
    }
}
