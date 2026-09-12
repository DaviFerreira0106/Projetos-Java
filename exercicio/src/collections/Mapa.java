package collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Davi Ferreira");
        usuarios.put(25, "Fernando Felix");
        usuarios.put(3, "Antonio Carlos");

        System.out.println(usuarios.entrySet());

        usuarios.put(1, "Davi");

        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.containsKey(68));
        System.out.println(usuarios.containsValue("Davi"));

        System.out.println(usuarios.get(3));

        for(Entry<Integer, String> usuario: usuarios.entrySet()) {
            System.out.print(usuario.getKey() + " ===> ");
            System.out.println(usuario.getValue());
        }

        usuarios.remove(3);
        usuarios.remove(25, "Fernando Felix");
    }
}
