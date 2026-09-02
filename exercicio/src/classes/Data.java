package classes;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterData() {
        return "Data: dia/mes/ano".replace("dia", Integer.toString(dia)).replace("mes", Integer.toString(mes)).replace("ano", Integer.toString(ano));
    }
}
