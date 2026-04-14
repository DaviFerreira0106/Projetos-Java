package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversão {
    public static void main(String[] args) {
        // Criar objeto de captura
        Scanner objScanner = new Scanner(System.in);

        // Pegar os dados
        System.out.println("Digite seu salário de Janeiro: ");
        String sal1 = objScanner.nextLine();

        System.out.println("Digite seu salário de Fevereiro: ");
        String sal2 = objScanner.nextLine();

        System.out.println("Digite seu salário de Março: ");
        String sal3 = objScanner.nextLine();

        // Fechar conexão com obj
        objScanner.close();

        // Converter os dados para o tipo correto
        double valor1 = Double.parseDouble(sal1.replace(',', '.'));
        double valor2 = Double.parseDouble(sal2.replace(',', '.'));
        double valor3 = Double.parseDouble(sal3.replace(',', '.'));

        // Realizar calculo
        double media = (valor1 + valor2 + valor3) / 3;

        // Exibir resultado
        System.out.printf("A media salárial foi: %.2f", media);
    }
}
