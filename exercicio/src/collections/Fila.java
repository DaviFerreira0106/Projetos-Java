package collections;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Davi Ferreira");
        fila.offer("Carlos Luiz");
        fila.add("Mayara Rodriguez");
        fila.offer("Suelen Lourenço");
        fila.add("Guilherme Batista");
        fila.offer("Josemar Peixoto");

        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        System.out.println("Tamanho: " + fila.size());

        System.out.println("Removido: " + fila.poll());
        System.out.println("Removido: " + fila.remove());

        System.out.println("Tamanho: " + fila.size());

        System.out.println(fila.isEmpty());
        System.out.println(fila);
        fila.clear();
    }
}
