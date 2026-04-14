package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;
        final double f = 86;

        final double c = (f - AJUSTE) * FATOR;

        System.out.println("Graus Celsius = " + c + "˚C.");
    }
}
