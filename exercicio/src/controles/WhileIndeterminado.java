package controles;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        String exit = "";
        Scanner sc = new Scanner(System.in);

        while(!"sair".equalsIgnoreCase(exit)) {
            System.out.print("Digite algo: ");
            exit = sc.nextLine().toLowerCase();
        }

        sc.close();
    }
}