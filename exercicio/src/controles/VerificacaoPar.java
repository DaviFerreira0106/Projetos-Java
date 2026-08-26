package controles;
import java.util.Scanner;

public class VerificacaoPar {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        boolean executar = true;

        while(executar) {
            System.out.print("\n\nDigite \"Sair\" para encerrar do programa!");
            System.out.print("\nDigite um número entre 0 e 10 para ver se ele é ímpar ou par: ");

            if (objTeclado.hasNextInt()) {
                int valor = objTeclado.nextInt();
                if(valor >= 0 && valor <=10) {
                    if(valor % 2 == 0) {
                        System.out.printf("O valor %d é Par", valor);
                    } else {
                        System.out.printf("O valor %d é Ímpar", valor);
                    }
                } else {
                    System.out.println("Digite um valor entre 0 e 10!");
                }
            } else if(objTeclado.next().equalsIgnoreCase("Sair")) {
                executar = false;
            }else {
                System.out.print("Digite um valor válido!");
            }

        }

        objTeclado.close();
    }
}
