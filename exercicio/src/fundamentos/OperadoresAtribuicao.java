package fundamentos;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int a = 2;
        var b = a;
        int c = b++;

        System.out.printf("Operação Aditiva: %d", c += b);
        System.out.printf("\nOperação Subtrativa: %d", c -= b);
        System.out.printf("\nOperação Multiplicativa: %d", c *= a);
        System.out.printf("\nOperação Divisiva: %d", c /= 10);
        System.out.printf("\nOperação Modulor: %d", c %= b);
    }
}
