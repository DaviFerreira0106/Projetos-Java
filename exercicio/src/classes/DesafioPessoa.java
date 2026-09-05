package classes;

public class DesafioPessoa {

    String nome;
    double peso;

    DesafioPessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(DesafioComida comida){
        this.peso = this.peso + comida.peso;
    }
}
