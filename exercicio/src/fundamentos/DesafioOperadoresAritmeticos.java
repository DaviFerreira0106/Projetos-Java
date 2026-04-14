package fundamentos;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        double blocoA = Math.pow(6 * (3 + 2), 2);
        double blocoB = 3 * 2;
        double blocoC = (1 - 5) * (2 - 7);
        double blocoD = Math.pow(10, 3);

        double moduloA = blocoA / blocoB;
        double moduloB = Math.pow(blocoC / 2, 2);
        double moduloC = Math.pow(moduloA - moduloB, 3);
        double moduloD = moduloC / blocoD;

        System.out.printf("O valor da operação foi: %.2f", moduloD);
    }
}
