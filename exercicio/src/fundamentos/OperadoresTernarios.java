package fundamentos;

public class OperadoresTernarios {
    public static void main(String[] args) {
        double media = 4.6;
        String resultado = media >= 7.0 ? "aprovado." : media >= 5.0 ? "de recuperação." : "reprovado.";

        System.out.printf("O aluno está %s", resultado);
    }
}
