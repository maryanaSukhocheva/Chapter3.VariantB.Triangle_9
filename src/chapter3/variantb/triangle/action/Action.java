package chapter3.variantb.triangle.action;
import chapter3.variantb.triangle.entity.Triangle;
import java.util.List;
/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
    
    public Action() {
    }

   //количество равносторонних треугольников
    public static int equilateralCount(List<Triangle> triangles) {
        checkNull(triangles);

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return equilateralCount(trianglesArray);
    }

    public static int equilateralCount(Triangle... triangles) {
        checkNull(triangles);

        int sum = 0;

        for (Triangle triangle : triangles) {
            if (triangle.isEquilateral()) {
                sum++;
            }
        }

        return sum;
    }

    //количество равнобедренных треугольников
    public static int isoscelesCount(List<Triangle> triangles) {
        checkNull(triangles);

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return isoscelesCount(trianglesArray);
    }

    public static int isoscelesCount(Triangle... triangles) {
        checkNull(triangles);

        int sum = 0;

        for (Triangle triangle : triangles) {
            if (triangle.isIsosceles()) {
                sum++;
            }
        }

        return sum;
    }
    //количество прямоугольных треугольников
    public static int rightCount(List<Triangle> triangles) {
        checkNull(triangles);

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return rightCount(trianglesArray);
    }

    public static int rightCount(Triangle... trianglesArray) {
        int sum = 0;

        for (Triangle triangle : trianglesArray) {
            if (triangle.isRect()) {
                sum++;
            }
        }

        return sum;
    }
        //количество произвольных треугольников
      public static int arbitraryCount(List<Triangle> triangles) {
        checkNull(triangles);

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return arbitraryCount(trianglesArray);
    }

    public static int arbitraryCount(Triangle... triangles) {
        checkNull(triangles);

        int sum = 0;

        for (Triangle triangle : triangles) {
            if (triangle.isArbitrary()) {
                sum++;
            }
        }

        return sum;
    }
    // Наибольший по площади объект
    public static Triangle getMaxAreaTriangle(List<Triangle> triangles) {
        checkNull(triangles);

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return getMaxAreaTriangle(trianglesArray);
    }

    public static Triangle getMaxAreaTriangle(Triangle... triangles) {
        checkNull(triangles);

        Triangle maxAreaTriangle = triangles[0];

        for (int i = 1, size = triangles.length; i < size; i++) {
            if (triangles[i].getArea() > maxAreaTriangle.getArea()) {
                maxAreaTriangle = triangles[i];
            }
        }

        return maxAreaTriangle;
    }
//Наименьший по площади объект
    public static Triangle getMinAreaTriangle(List<Triangle> triangles) {
        checkNull(triangles);

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return getMinAreaTriangle(trianglesArray);
    }

    public static Triangle getMinAreaTriangle(Triangle... triangles) {
        checkNull(triangles);

        Triangle minAreaTriangle = triangles[0];

        for (int i = 1, size = triangles.length; i < size; i++) {
            if (triangles[i].getArea() < minAreaTriangle.getArea()) {
                minAreaTriangle = triangles[i];
            }
        }

        return minAreaTriangle;
    }

    private static void checkNull(Object object){
        if (object == null){
            throw new IllegalArgumentException();
        }
    }
 
}
