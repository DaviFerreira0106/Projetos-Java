package controles;

import java.util.Scanner;

public class ControleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média do aluno(a): ");
        double media = sc.nextDouble();

        sc.close();

        boolean condicaoAprovacao = media <= 10 && media >= 7.0;
        boolean condicaoRecuperacao = media < 7.0 && media >= 4.0;
        boolean condicaoReprovacao = media < 4.0 && media >= 0;

        if(condicaoAprovacao) {
            System.out.println("Aluno(a) Aprovado(a)!");
            System.out.println("Parabens!");
        }

        if(condicaoRecuperacao) {
            System.out.println("Aluno(a) de Recuperação!");
        }

        if(condicaoReprovacao) {
            System.out.println("Aluno(a) Reprovado!");
        }
    }
}
