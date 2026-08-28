package fundamentos;
import java.util.Scanner;

public class SomaValor {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        boolean ligado = true;
        int valor = 0;

        do {
            System.out.print("\nDigite um número: ");
            if (!objTeclado.hasNextInt()) {
                System.out.println("Digite um valor válido!");
            }else {
                int num = objTeclado.nextInt();

                if(num < 0){
                    ligado = false;
                    num = 0;
                }

                valor = num + valor;
                System.out.printf("\nValor agregado: %d", valor);

            }
        } while(ligado);
    }
}


