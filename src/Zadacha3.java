/*Необходимо посчитать зарплату рабочего за месяц. На консоль вводится,
сколько дней в месяце было отработано, дальше вводится вещественное число — зарплата
за день. Нужно вывести зарплату рабочего за весь месяц. Например, если в месяце было
отработано 10 дней, а зарплата в день была 5500.25 рублей, то программа должна
вывести в результате — 55002.5 */
import java.util.Scanner;
public class Zadacha3 {
    public Zadacha3(){

        System.out.println("Введите количество отработанных дней:");
        int rabochieDni = new Scanner(System.in).nextInt();
        System.out.println("Введите зарплату рабочего за день");
        float zarplataDen = new Scanner(System.in).nextFloat();
        float zarplataMesjac = rabochieDni * zarplataDen;
        System.out.println("Работник заработал " + zarplataMesjac + " рублей.");

    }
}
