package chapter3.variantb.triangle.action;

import chapter3.variantb.triangle.entity.Point;
import chapter3.variantb.triangle.entity.Triangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sukhocheva Maryana
 */
public class InputData {
   // addes N random triangles to list
    public static List<Triangle> generationRandomNTriangles(int n) {
        List<Triangle> arrayOfTriangles = new ArrayList<>();
        
        Random rand = new Random();
        int i = 0;
        while (i < n) {
            Point pa = new Point(rand);
            Point pb = new Point(rand);
            Point pc = new Point(rand);
            try {
                Triangle temp = new Triangle(pa, pb, pc);
                i++;
                arrayOfTriangles.add(temp);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return arrayOfTriangles;
    }
    
    public static  List<Triangle> generationTriangles(){
        List<Triangle> arrayOfTriangles = new ArrayList<>();
       // Треугольник №1
        try {
        Triangle triangle = new Triangle();
        triangle.setA(new Point(0,0));
        triangle.setB(new Point(6,0));
        triangle.setC(new Point(3,5));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        // Треугольник №2
        triangle = new Triangle();
        triangle.setA(new Point(0,0));
        triangle.setB(new Point(0,4));
        triangle.setC(new Point(3,2));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        // Треугольник №3
        triangle = new Triangle();
        triangle.setA(new Point(0,0));
        triangle.setB(new Point(10,0));
        triangle.setC(new Point(5,10*Math.sin(Math.PI/3)));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        // Треугольник №4
        triangle = new Triangle();
        triangle.setA(new Point(-7,0));
        triangle.setB(new Point(7,0));
        triangle.setC(new Point(0,14*Math.sin(Math.PI/3)));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        // Треугольник №5
        triangle = new Triangle();
        triangle.setA(new Point(0,0));
        triangle.setB(new Point(8,0));
        triangle.setC(new Point(0,6));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        // Треугольник №6
        triangle = new Triangle();
        triangle.setA(new Point(-7,0));
        triangle.setB(new Point(-3,0));
        triangle.setC(new Point(-3,2));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        // Треугольник №7
        triangle = new Triangle();
        triangle.setA(new Point(0,0));
        triangle.setB(new Point(5,2));
        triangle.setC(new Point(2,6));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        // Треугольник №8
        triangle = new Triangle();
        triangle.setA(new Point(-7,-5));
        triangle.setB(new Point(-3,4));
        triangle.setC(new Point(-2,8));
        if (!triangle.isNotTriangle()) {
                arrayOfTriangles.add(triangle);
            }
        } catch (Exception ex) {
            System.err.println("Error when creating triangles");
        }
        System.out.println("Создан массив треугольников");
        return arrayOfTriangles;
    }
    
   // inputs points of triangle from keyboard
    public static void inputTriangle(List<Triangle> triangles, Scanner sc) {
        System.out.println("Введите координаты точек треугольника: ");
        System.out.println("Точка A: ");
        Point pA = inputPoint(sc);
        System.out.println("Точка B: ");
        Point pB = inputPoint(sc);
        System.out.println("Точка C: ");
        Point pC = inputPoint(sc);
        try {
            Triangle newTriangle = new Triangle(pA, pB, pC);
            triangles.add(newTriangle);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "Треугольник не создан!");
        }
    }

    // inputs point coordinates from keyboard
    private static Point inputPoint(Scanner sc) {
        System.out.println("Введите координату x: ");
        double x = inputDouble(sc);
        System.out.println("Введите координату y: ");
        double y = inputDouble(sc);
        return new Point(x,y);
    }

    
    // provides correct input of double
    public static double inputDouble(Scanner sc) {
        double value = 0;
        boolean isNotSuccess = true;
        while (isNotSuccess) {
            try {
                String s = sc.nextLine();
                value = Double.parseDouble(s);
                isNotSuccess = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка формата ввода! Введите ещё раз:");
            }
        }
        return value;
    }

    // provides correct input of int
    public static int inputInt(Scanner sc) {
        int value = 0;
        boolean isNotSuccess = true;
        while (isNotSuccess) {
            try {
                String s = sc.nextLine();
                value = Integer.parseInt(s);
                isNotSuccess = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка формата ввода! Введите ещё раз:");
            }
        }
        return value;
    }

}
