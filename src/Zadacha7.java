/*
Заданы координаты вершин треугольника, необходимо вычислить площадь.
Для этого сначала необходимо найти длины сторон треугольника, а затем вычислить площадь
треугольника по длинам сторон. */
import java.util.Scanner;
public class Zadacha7 {
    public Zadacha7(){

        System.out.println("Введите координаты вершин треугольника:");
        System.out.println("Введите координаты X и Y первой вершины:");
        float a1 = new Scanner(System.in).nextFloat();
        float a2 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координаты X и Y второй вершины:");
        float b1 = new Scanner(System.in).nextFloat();
        float b2 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координаты X и Y третьей вершины:");
        float c1 = new Scanner(System.in).nextFloat();
        float c2 = new Scanner(System.in).nextFloat();
        System.out.println("Найдем длину сторон треугольника");
        double dlinaABX = Math.pow(b1,2) - Math.pow(a1,2);
        double dlinaABY = Math.pow(b2,2) - Math.pow(a2,2);
        double dlinaAB = Math.sqrt(dlinaABX + dlinaABY);
        System.out.println("Длина АB = " + dlinaAB);
        double dlinaBCX = Math.pow(b1,2) - Math.pow(c1,2);
        double dlinaBCY = Math.pow(b2,2) - Math.pow(c2,2);
        double dlinaBC = Math.sqrt(dlinaBCX + dlinaBCY);
        System.out.println("Длина BC = " + dlinaBC);
        double dlinaACX = Math.pow(c1,2) - Math.pow(a1,2);
        double dlinaACY = Math.pow(c2,2) - Math.pow(a2,2);
        double dlinaAC = Math.sqrt(dlinaACX + dlinaACY);
        System.out.println("Длина AC = " + dlinaAC);
        System.out.println("Площадь треугольника = " + (dlinaAB + dlinaBC + dlinaAC) / 2);

    }

}
