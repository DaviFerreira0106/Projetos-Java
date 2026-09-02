package classes;

public class DataTeste {

    public static void main(String[] args) {
        Data objData = new Data();

        System.out.println(objData.obterData());

        Data obj = new Data(1,  6, 2002);

        System.out.printf(obj.obterData());
    }
}
