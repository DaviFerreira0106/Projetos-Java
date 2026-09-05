package classes;

public class ValorVsReferencia {

    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data();
        Data d2 = d1;

        d2.dia = 27;
        d2.ano = 2025;

        System.out.println(d1.obterData());
    }
}
