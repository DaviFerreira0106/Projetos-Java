package classes;

public class DataTeste {

    public static void main(String[] args) {
        Data objData = new Data();
        objData.dia = 1;
        objData.mes = 6;
        objData.ano = 2002;

        System.out.printf("Data: %d/%d/%d", objData.dia, objData.mes, objData.ano);
    }
}
