package fundamentos;

public class IgualdadeString {
    public static void main(String[] args) {
        String s1 = "2";
        String s2 = new String("2");
        System.out.printf("É igual?: %b", s1 == "2");
        System.out.printf("\nÉ igual?: %b", s1 == s2);
        System.out.printf("\nÉ igual?: %b", s1.equals(s2));
    }
}
