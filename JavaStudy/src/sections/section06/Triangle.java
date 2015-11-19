package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public class Triangle extends Shape {

    //定义三角形的三条边
    private double a;
    private double b;
    private double c;

    public Triangle(String color,double a,double b,double c){
        super(color);
        setSides(a, b, c);
    }
    public void setSides(double a,double b,double c){
        if (a > b + c || b > a + c || c > a + b){
            System.out.printf("三角形两边之和必须大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //重写Shape 类的 计算周长的抽象方法

    public double calPerimeter(){
        return a+b+c;
    }

    public String getType(){
        return "三角形";
    }

}
