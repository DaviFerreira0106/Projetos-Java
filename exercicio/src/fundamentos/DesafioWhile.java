package fundamentos;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        boolean comando = true;
        double total = 0;
        int incremento = 0;

        while(comando) {
            System.out.println("Digite uma nota válida: ");
            double valor = objTeclado.nextDouble();

            if(valor == -1){
                comando = false;
            } else if(valor < 0 || valor > 10) {
                System.out.println("Digite um valor válido entre 0 e 10!");
            } else {
                total += valor;
                incremento += 1;
            }
        }

        double media = total / incremento;

        System.out.printf("Total: %.2f", total);
        System.out.printf("\nNúmero de alunos: %d", incremento);
        System.out.printf("\nMédia: %.2f", media);
    }
}
