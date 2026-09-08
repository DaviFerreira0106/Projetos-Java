package collections;
import java.util.TreeSet;
import java.util.HashSet;

public class HashSetHomogeneo {

    public static void main(String[] args) {
        TreeSet<String> candidatos = new TreeSet<String>();

        candidatos.add("Davi Ferreira");
        candidatos.add("Carlito Souza");
        candidatos.add("Miguel Falabela");
        candidatos.add("Antonia Candido");
        candidatos.add("Maria da Gloria");

        for(String candidato: candidatos) {
            System.out.println(candidato);
        }

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(25);
        numeros.add(3);
        numeros.add(6);
        numeros.add(89);
        numeros.add(41);

        for(int num: numeros) {
            System.out.println(num);
        }

        HashSet<Double> precos = new HashSet<Double>();

        precos.add(26.21);
        precos.add(47.58);
        precos.add(29.12);
        precos.add(34.24);
        precos.add(98.99);

        for(double preco: precos) {
            System.out.println(preco);
        }

        TreeSet<Boolean> chaves = new TreeSet<>();

        chaves.add(true);
        chaves.add(false);

        System.out.println(chaves);
    }
}
