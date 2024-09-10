/*Считать с консоли два числа (int) в переменные a и b, обменять значения переменных
и вывести на экран. Например, если с консоли вводятся значения a=2 а b=5,
то нужно поменять значения переменных местами: a=5, b=2.
 */
import java.util.Scanner;

public class Zadacha1 {
    public Zadacha1(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //дописать недостающий код
        int temp = a;

        a = b;
        b = temp;

        System.out.println("Пользователь ввел значение для a: " + a + " и b: " + b);
    }
}
