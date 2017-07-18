package chapter3.variantc.triangle.main;

import chapter3.variantc.triangle.action.Action;
import chapter3.variantc.triangle.action.InputData;
import chapter3.variantc.triangle.action.OutputData;
import chapter3.variantc.triangle.entity.Triangle;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<Triangle> triangles = InputData.generationTriangles() ;
      
        System.out.println("Площадь и периметр треугольников:");
        OutputData.outputAreaPerimetr(triangles);
        
        System.out.println("Количество треугольников:");
        System.out.print("Равносторонних: " );
        System.out.println(Action.equilateralCount(triangles));
        System.out.print("Равнобедренных: ");
        System.out.println(Action.isoscelesCount(triangles));
        System.out.print("Прямоугольных: ");
        System.out.println(Action.rightCount(triangles));
        System.out.print("Произвольных: ");
        System.out.println(Action.arbitraryCount(triangles));
        

        System.out.print("Наибольший по площади объект ");
        System.out.println(Action.getMaxAreaTriangle(triangles));

        System.out.print("Наименьший по площади объект ");
        System.out.println(Action.getMinAreaTriangle(triangles));
    }
    
}
