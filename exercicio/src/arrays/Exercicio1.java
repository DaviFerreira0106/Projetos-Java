package arrays;
import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {
        double[] notasAluno1 = new double[4];

        notasAluno1[0] = 7.6;
        notasAluno1[1] = 4.6;
        notasAluno1[2] = 6.2;
        notasAluno1[3] = 8.3;

        System.out.println(Arrays.toString(notasAluno1));

        double mediaAluno1 = 0;
        for(int i = 0; i < notasAluno1.length; i++) {
            mediaAluno1 += notasAluno1[i];
        }

        System.out.println(mediaAluno1 / notasAluno1.length);

        double[] notasAluno2 = {5.6, 2.6, 9.5, 7.4};

        double mediaAluno2 = 0;
        for(int i = 0; i < notasAluno2.length; i++) {
            mediaAluno2 = mediaAluno2 + notasAluno2[i];
        }

        System.out.println(Arrays.toString(notasAluno2));
        System.out.println(mediaAluno2 / notasAluno2.length);
    }
}
