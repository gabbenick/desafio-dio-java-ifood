import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int c = 0;

        int result = 0;

        for (int i = 0; i < N / A; i++) {
            c += A;
            result += c;
        }
        System.out.println(result);
    }
}