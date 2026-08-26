package controles;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String day = sc.nextLine().toLowerCase();

        sc.close();

        if(day.equals("domingo")) {
            System.out.println(1);
        } else if(day.startsWith("segunda")) {
            System.out.println(2);
        } else if(day.startsWith("terça")) {
            System.out.println(3);
        } else if(day.startsWith("quarta")) {
            System.out.println(4);
        } else if(day.startsWith("quinta")) {
            System.out.println(5);
        } else if(day.startsWith("sexta")) {
            System.out.println(6);
        } else if(day.startsWith("sabado")) {
            System.out.println(7);
        } else {
            System.out.println("Dia invalído!");
        }
    }
}
