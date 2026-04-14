package fundamentos;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        // Verificar qual TV comprou
        if(trabalho1 && trabalho2) {
            System.out.println("Comprou a TV de 50 polegadas");
            System.out.println("Familia foi tomar sorvete");
        }else if(trabalho1 ^ trabalho2) {
            System.out.println("Comprou a TV de 32 polegadas");
            System.out.println("Familia foi tomar sorvete");
        }else {
            System.out.println("Não comprou TV");
            System.out.println("Familia não tomou nada");
        }
    }
}
