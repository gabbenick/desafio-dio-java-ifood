import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        int num = leitor.nextInt();
        int a = 0;

        for (int i = 0; i < elementos.length; i++) {
            if (num == elementos[i]) {
                System.out.println("Achei " + num + " na posicao " + i);
                a = 1;
            }
        }
        if (a == 0) {

            System.out.println("Numero " + num + " nao encontrado!");
        }
    }
}