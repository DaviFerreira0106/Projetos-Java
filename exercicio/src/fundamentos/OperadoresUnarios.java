package fundamentos;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.printf("Valores iguais?: %b", ++a == b--);
        System.out.printf("\nComparação de Valores: %b", a == b);
    }
}
