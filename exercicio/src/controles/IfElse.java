package controles;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número");

        int num = Integer.parseInt(numero);

        if(num % 2 == 0) {
            System.out.println("Número Par!");
        } else {
            System.out.println("Número Ímpar!");
        }
    }
}
