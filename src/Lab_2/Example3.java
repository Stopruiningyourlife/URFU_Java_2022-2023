package Lab_2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int answer = num % 4;
        if ( answer == 0 && 9 < num ) {
            System.out.println("Число делится на 4, при этом оно не меньше 10");
        } else {
            System.out.println("Число не делится на 4 или оно меньше 10");
        }
    }
}
