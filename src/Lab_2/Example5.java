package Lab_2;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.println("Количество тысяч в числе: " + a / 1000);
        in.close();

    }
}