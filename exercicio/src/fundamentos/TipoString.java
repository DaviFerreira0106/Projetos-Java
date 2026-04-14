package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        var frase = "Bom dia Gente!";

        System.out.println(frase.charAt(4));
        System.out.println(frase.startsWith("bom"));
        System.out.println(frase.endsWith("Gente!"));
        System.out.println(frase.equals("BOM DIA GENTE!"));
        System.out.println(frase.equalsIgnoreCase("BOM DIA GENTE!"));

        String nome = "Davi Ferreira";
        short id = 31232;
        float salario = 3.214F;
        byte idade = 23;

        System.out.printf("Meu nome é %s e tenho %d anos, meu id na empresa é %d e atualmente recebo R$%.3f", nome, idade, id, salario);
    }
}
