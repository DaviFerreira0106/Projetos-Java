package fundamentos;
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        Random objRandom = new Random();

        int valorAleatorio = objRandom.nextInt(101);
        for(int i = 10; i >= 0; i--) {
            System.out.print("\nTente adivinhar um número entre 0 e 100: ");
            if(!objTeclado.hasNextInt()){
                System.out.println("Digite um número válido!");
            } else {
                int valorDigitado = objTeclado.nextInt();

                if(valorAleatorio == valorDigitado) {
                    System.out.println("Você Acertou!");
                    i = 0;
                } else {
                    String result = valorAleatorio > valorDigitado ? "O número digitado é menor que o valor aleatório" : "O valor digitado é maior que o valor aleatório";
                    System.out.printf("%s\ntentativas restantes %d", result, i - 1);
                }
            }
        }
        System.out.printf("Valor Aleatório: %d", valorAleatorio);
    }
}
