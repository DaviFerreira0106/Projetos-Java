package fundamentos;
import java.util.Scanner;

public class NumeroPrimoSwitch {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);

        System.out.print("Digite um número: ");

        if(!objTeclado.hasNextInt()) {
            System.out.println("Digite um número válido!");
        } else {
            int num = objTeclado.nextInt();

            String valor = num > 1 && num % 1 == 0 && num % num == 0 ? "Primo" : "Não primo";

            switch(valor.toLowerCase()){

                case "primo":
                    System.out.println("Valor Primo!");
                    break;

                case "não primo":
                    System.out.println("Valor Não Primo!");
                    break;
            }
        }


    }
}
