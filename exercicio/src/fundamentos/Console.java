package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual sua idade: ");
        byte idade = teclado.nextByte();
        teclado.nextLine();

        System.out.print("Qual o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Qual o seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.printf("Nome: %s%nSobrenome: %s%nIdade: %d", nome, sobrenome, idade);

        teclado.close();
    }
}
