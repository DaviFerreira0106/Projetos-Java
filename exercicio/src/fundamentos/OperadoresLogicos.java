package fundamentos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean operador1 = true;
        boolean operador2 = 3 > 7;

        System.out.println(operador1 && operador2);
        System.out.println(operador1 || operador2);
        System.out.println(operador1 ^ operador2);
        System.out.println(!operador1);
        System.out.println(!operador2);
    }
}
