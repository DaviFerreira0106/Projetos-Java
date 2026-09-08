package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollections {

    public static void main(String[] args) {
        HashSet objSet = new HashSet();

        objSet.add(1.4);
        objSet.add("Davi Ferreira");
        objSet.add('x');
        objSet.add(true);
        objSet.add(18);

        System.out.println(objSet.size());
        System.out.println(objSet.contains('x'));

        Set objSet2 = new HashSet();

        objSet2.add(1);
        objSet2.add(2);
        objSet2.add(3);

        objSet.addAll(objSet2);

        System.out.println(objSet);

        objSet.retainAll(objSet2);

        System.out.println(objSet);

    }
}
