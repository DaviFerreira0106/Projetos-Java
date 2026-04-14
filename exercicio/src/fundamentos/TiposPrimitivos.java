package fundamentos;

public class TiposPrimitivos {

    static void main(String[] args) {
        // Tipos Primitivos Inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 546;
        int id = 12321;
        long pontosAcumuladas = 11_232_101_429L;

        // Tipos Primitivos Flutuantes
        float salario = 5_600.00F;
        double vendasAcumuladas = 3_203_230_213_213_223_223.00;

        // Tipo Booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'a';

        System.out.println(anosDeEmpresa * 365);
        System.out.println(numeroDeVoos / 2);
        System.out.println(pontosAcumuladas / vendasAcumuladas);
        System.out.println(id + "Ganha --> " +salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
