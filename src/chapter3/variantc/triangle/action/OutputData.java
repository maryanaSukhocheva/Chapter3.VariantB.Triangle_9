package chapter3.variantc.triangle.action;

import chapter3.variantc.triangle.entity.Triangle;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class OutputData {
    //вывод площади и периметра треугольников
    public static void outputAreaPerimetr(List<Triangle> triangles) {
    for (Triangle triangle : triangles) {
            System.out.println(triangle);

            System.out.print("Площадь = ");
            System.out.println(triangle.getArea());

            System.out.print("Периметр = ");
            System.out.println(triangle.getPerimeter());

            System.out.println();
        }
    }
}
