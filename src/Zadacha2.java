/*Считать с консоли три вещественных числа, вывести их сумму и произведение.*/
import java.util.Scanner;
public class Zadacha2 {
    public Zadacha2(){
        System.out.println("Введите три значения с плавающей точкой:");
        float a = new Scanner(System.in).nextFloat();
        float b = new Scanner(System.in).nextFloat();
        float c = new Scanner(System.in).nextFloat();

        System.out.println("Сумма заданных чисел равна: " + (a + b + c) + " Произведение заданных чисел равно: " + (a * b * c));

    }

}
