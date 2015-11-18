package sections.section06;

/**
 * Created by apple on 15/5/24.
 */

class Apple1{
    private String color;
    private double weight;
    public  Apple1(){}

    //提供有参数的构造器
    public Apple1(String color,double weight){
        this.color = color;
        this.weight = weight;
    }
    //省略 color 和 weight 属性的setter 和 getter 方法

    //重写 toStirng()方法，用于实现Apple1 对象的自我描述
    public String toString(){
        return "一个苹果，颜色是：" + color + " 重量是：" + weight;
    }
}

public class ToStringTest {

    public void doSth(){
        Apple1 apple1 = new Apple1("红色",5.68);
        System.out.println(apple1);
    }



}
