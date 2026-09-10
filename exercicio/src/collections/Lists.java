package collections;
import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        ArrayList<ListsUsuario> listaUsuario = new ArrayList<ListsUsuario>();

        listaUsuario.add(new ListsUsuario("Davi Ferreira"));
        listaUsuario.add(new ListsUsuario("Carlito Ferreira"));
        listaUsuario.add(new ListsUsuario("Carlos Luiz"));
        listaUsuario.add(new ListsUsuario("Geovanio Souza"));
        listaUsuario.add(new ListsUsuario("Pedro Silva"));
        listaUsuario.add(new ListsUsuario("Davi Ferreira"));

        System.out.println(listaUsuario.getFirst().nome);
        System.out.println(listaUsuario.get(2).nome);
        System.out.println(listaUsuario.getLast().nome);

        System.out.println(listaUsuario.get(0).equals(listaUsuario.getLast()));
        System.out.println(listaUsuario.getFirst());
        System.out.println(listaUsuario.size());

        System.out.println(listaUsuario.remove(new ListsUsuario("Carlos Luiz")));
        ListsUsuario objRemovido = listaUsuario.remove(1);
        System.out.println(objRemovido.nome);
        System.out.println(listaUsuario.size());

    }
}
