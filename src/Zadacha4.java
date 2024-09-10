/*Посчитать дискриминант квадратного уравнения. Дискриминант рассчитывается по
формуле D=b^2-4ac. Пользователем вводятся значения a, b и c. Нужно вывести дискриминант
уравнения.
 */
import java.util.Scanner;
public class Zadacha4 {
    public Zadacha4(){
        System.out.println("Введите три значения квадратного уравнения");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int d = (b*b) - (4 * a * c);


        System.out.println("Дискриминант равен = " + d);

    }
}
