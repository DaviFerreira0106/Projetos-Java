package classes;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterData() {
        return "Data: dia/mes/ano".replace("dia", Integer.toString(dia)).replace("mes", Integer.toString(mes)).replace("ano", Integer.toString(ano));
    }
}
