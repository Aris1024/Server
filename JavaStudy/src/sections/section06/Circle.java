package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }

    public double calPerimeter(){
        return 2 * radius * Math.PI;
    }

    public String getType(){
        return getColor() + "圆形";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
