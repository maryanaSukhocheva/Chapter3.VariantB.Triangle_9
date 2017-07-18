package chapter3.variantc.triangle.entity;
/**
 *
 * @author Sukhocheva Maryana
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private double ab;
    private double bc;
    private double ac;
    public static final double EPS = 1e-6;


    public Triangle(Point a, Point b, Point c) throws IllegalArgumentException {
        ab = findDistance(a,b);
        bc = findDistance(b,c);
        ac = findDistance(a,c);
        boolean isNot = isNotTriangle();
        if (isNot) {
            throw new IllegalArgumentException("Не может быть треугольником! ");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        a = new Point(0,0);
        b = new Point(0,0);
        c = new Point(0,0);
    }

    public boolean isNotTriangle() {
        return (ab > bc + ac || areEqual(ab, bc + ac) ||
                bc > ab + ac || areEqual(bc, ab + ac) ||
                ac > ab + bc || areEqual(ac, ab + bc) ||
                (ab==0 && bc==0 && ac==0));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append('}');
        return sb.toString();
    }

    private double findDistance(Point a, Point b) {
        double dx = b.getX()- a.getX();
        double dy = b.getY()- a.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getPerimeter() {
        return findDistance(a,b) + findDistance(b,c) + findDistance(c,a);
    }

    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p-ab) * (p-bc) * (p-ac));
    }

    public boolean isEquilateral() { // равносторонний
        return areEqual(ab, bc) && areEqual(bc, ac);
    }

    public boolean isIsosceles() {  // равнобедренный
        return (areEqual(ab, bc) || areEqual(bc, ac) || areEqual(ab, ac)) && (!isEquilateral());
    }

    public boolean isRect() { // прямоугольный
        double x = ab * ab;
        double y = bc * bc;
        double z = ac * ac;
        return (areEqual(x, y+z)) || (areEqual(y, x+z)) || (areEqual(z, x+y));
    }

    public boolean isArbitrary() { // произвольный
        return !isIsosceles() && !isEquilateral() && !isRect();
    }

    private boolean areEqual (double x, double y) {
        return Math.abs(x-y) < EPS;
    }

    public void setA(Point a) {
        this.a = a;
        ab = findDistance(a,b);
        ac = findDistance(a,c);
    }

    public void setB(Point b) {
        this.b = b;
        ab = findDistance(a,b);
        bc = findDistance(b,c);
    }

    public void setC(Point c) {
        this.c = c;
        bc = findDistance(b,c);
        ac = findDistance(a,c);
    }
    
 
   
}
