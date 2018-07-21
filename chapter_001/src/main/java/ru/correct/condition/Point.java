package ru.correct.condition;

/**
 * @author Aleksey Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @version &Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanseTo(Point that){
        Point a = this;
        Point b = that;

        double result = Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
        return result;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanseTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}