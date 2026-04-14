package fundamentos;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        System.out.println(3 > 7);
        System.out.println(4 >= 4);
        System.out.println(30 < 4);
        System.out.println(30 <= 40);

        boolean bomComportamento = true;
        double nota = 7.3;
        boolean passouDaMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouDaMedia;

        System.out.printf("\nTem Desconto? %b", temDesconto);
    }
}
