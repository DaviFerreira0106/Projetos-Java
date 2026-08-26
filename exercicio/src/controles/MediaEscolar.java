package controles;
import java.util.Scanner;

public class MediaEscolar {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");

        if(objTeclado.hasNextDouble()) {
            int nota = objTeclado.nextInt();

            switch(nota) {
                case 10: case 9: case 8: case 7:
                    System.out.println("Aprovado!");
                    break;
                case 6: case 5: case 4:
                    System.out.println("Recuperação");
                    break;
                case 3: case 2: case 1: case 0:
                    System.out.println("Reprovado!");
                    break;
                default:
                    System.out.print("");
            }
        } else {
            System.out.println("Valor inválido! Digite apenas valores númericos!");
        }

        objTeclado.close();
    }
}
