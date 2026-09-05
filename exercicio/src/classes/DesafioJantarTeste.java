package classes;

public class DesafioJantarTeste {

    public static void main(String[] args) {
        DesafioComida c1 = new DesafioComida("Arroz", 0.130);
        DesafioComida c2 = new DesafioComida("Feijão", 0.100);
        DesafioComida c3 = new DesafioComida("Bife", 0.350);

        DesafioPessoa p1 = new DesafioPessoa("Davi Ferreira", 73.25);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Peso: " + p1.peso);

        p1.comer(c1);

        System.out.println("Comeu " + c1.nome);
        System.out.println("Peso atual: " + String.format("%.2f", p1.peso));

        p1.comer(c2);

        System.out.println("Comeu " + c2.nome);
        System.out.println("Peso atual: " + String.format("%.2f", p1.peso));

        p1.comer(c3);

        System.out.println("Comeu " + c3.nome);
        System.out.println("Peso atual: " + String.format("%.2f", p1.peso));
    }

}
