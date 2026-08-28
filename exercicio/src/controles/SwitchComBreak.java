package controles;
import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner objTeclado = new Scanner(System.in);
        String conceito = "";

        System.out.print("Digite uma nota: ");
        int nota = objTeclado.nextInt();

        switch(nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1:
                conceito = "E";
                break;
            default:
                conceito = "Não informado";
        }

        objTeclado.close();
        System.out.printf("Conceito %s", conceito);
        System.out.println("\n" +
                "Fim!");
    }
}
