package arrays;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;

        System.out.print("Digite a quantidade de notas que deseja informar: ");
        int qtdNotas = sc.nextInt();

        double[] notas = new double[qtdNotas];

        for(int i = 0; i < qtdNotas; i++) {
            System.out.printf("\nDigite a %dª nota: ", i+1);
            notas[i] = sc.nextDouble();
        }

        for(double nota : notas) {
            media += nota;
        }

        System.out.printf("\nMedia do aluno: %.2f", media / notas.length);

        sc.close();
    }
}
