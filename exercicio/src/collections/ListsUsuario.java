package collections;

public class ListsUsuario {

    String nome;

    ListsUsuario(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ListsUsuario) {
            return this.nome.equals(((ListsUsuario) obj).nome);
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }
}
