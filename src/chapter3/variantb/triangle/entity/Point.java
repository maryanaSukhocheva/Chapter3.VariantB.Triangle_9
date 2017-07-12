/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.variantb.triangle.entity;

import java.util.Random;

/**
 *
 * @author SLAVA
 */
public class Point {
    public static final double MAX = 100;
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Random rand) {
        x = (rand.nextDouble()-0.5)*2*MAX;
        y = (rand.nextDouble()-0.5)*2*MAX;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
