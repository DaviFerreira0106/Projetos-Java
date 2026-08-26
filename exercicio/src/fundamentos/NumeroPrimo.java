package fundamentos;
import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        if(!objTeclado.hasNextInt()) {
            System.out.println("Digite um valor valido!");
        } else {
            int num = objTeclado.nextInt();
            if(num > 1 && num % 1 == 0 && num % num == 0) {
                System.out.println("O número é primo!");
            } else {
                System.out.println("O número não é primo!");
            }
        }
    }
}
