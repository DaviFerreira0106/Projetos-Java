package controles;
import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        boolean executar = true;

        while(executar) {
            System.out.print("\n\nDigite \"Sair\" para encerrar o programa!");
            System.out.print("\nDigite um ano, para verificar se ele é Bissexto!: ");

            if(!objTeclado.hasNext()) {
                if(objTeclado.next().equalsIgnoreCase("sair")) {
                    executar = false;
                }else {
                    System.out.println("Digite um valor válido!");
                }
            }else {
                int ano = objTeclado.nextInt();

                if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ) {
                    System.out.print("Ano é bissexto!");
                }else {
                    System.out.println("Ano não é bissexto!");
                }

            }
        }

        objTeclado.close();
    }
}
