import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        String result = "";
        int resultado;
        if (num % 3 == 0 && num % 5 == 0) {
            result = "FizzBuzz";
            System.out.println(result);
        } else if (num % 3 == 0) {
            result += "Fizz";
            System.out.println(result);
        } else if (num % 5 == 0) {
            result += "Buzz";
            System.out.println(result);
        } else {
            resultado = num;
            System.out.println(resultado);
        }

    }
}