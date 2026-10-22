 
import java.util.Random;

public class addofrandnum {
    public static void main(String[] args) {
        Random r = new Random();

        int num1 = r.nextInt(1000);
        int num2 = r.nextInt(999);
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        int num3 = r.nextInt(1000);
        int num4 = r.nextInt(999);
        int num5 = r.nextInt(1000);
        int sum2 = num3 + num4 + num5;

        System.out.println("The sum of " + num3 + ", " + num4 + " and " + num5 + " is: " + sum2);
    }
}
