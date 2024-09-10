/* Задана строка «Hello Java!». Найти номер буквы «J» при помощи
операции .indexOf() (смотри конец 4 урока!) Вывести строку в верхнем регистре
(то есть заглавными буквами) с помощью операции .toUpperCase()
Считать с консоли строку и вывести её длину на экран. Для этого воспользуйтесь операцией .length()
 */
import java.util.Scanner;
public class Zadacha5 {
    public Zadacha5 (){
        String a = "Hello Java!";
        System.out.println("Выведем номер буквы J - " + a.indexOf('J') + ", строка в верхнем регистре - " + a.toUpperCase());
        System.out.println("Введите строку:");
        String b = new Scanner(System.in).nextLine();
        System.out.println("Длина строки - " + b.length());

    }
}
