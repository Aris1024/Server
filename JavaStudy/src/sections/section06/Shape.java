package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public abstract class Shape {
    {
        System.out.printf("执行 Shape 的初始化块...");
    }

    private String color;

    //定义一个计算周长的抽象方法
    public abstract double calPerimeter();

    //定义一个返回形状的抽象方法
    public abstract String getType();

    //定义 Shape 的构造器,该构造器并不是用于创建Shape对象而是用于被子类调用
    public Shape(){};
    public Shape(String color){
        System.out.printf("执行 Shpae构造器...");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

