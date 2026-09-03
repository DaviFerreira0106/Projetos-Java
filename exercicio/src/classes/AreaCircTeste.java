package classes;

public class AreaCircTeste {

    public static void main(String[] args) {
        System.out.println(AreaCirc.PI);
        System.out.println(AreaCirc.area(20));

        AreaCirc instArea = new AreaCirc(30);
        System.out.println(instArea.area());
    }
}
