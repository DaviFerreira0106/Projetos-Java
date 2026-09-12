package collections;
import java.util.Set;
import java.util.HashSet;

public class HashCodeSet {

    public static void main(String[] args) {
        Set<ListsUsuario> usuarios = new HashSet<>();

        usuarios.add(new ListsUsuario("Davi Ferreira"));
        usuarios.add(new ListsUsuario("Guilherme Tadeo"));
        usuarios.add(new ListsUsuario("Fernanda Torres"));

        System.out.println(usuarios.contains(new ListsUsuario("Davi Ferreira")));
    }
}
