package collections;
import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Hobbit");
        livros.add("A fantastica fabrica de chocolate");
        livros.push("O senhor dos aneis");

        System.out.println(livros.peek());
        System.out.println(livros.element());


    }
}
