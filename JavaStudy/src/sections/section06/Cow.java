package sections.section06;

/**
 * Created by zhangjingle on 15/11/19.
 */
public class Cow {
    private double weight;

    public Cow(){}
    public Cow(double weight){
        this.weight = weight;
    }
    //定义一个非静态内部类
    private class Cowleg{
        //非静态内部类有两个 field
        private double length;
        private String color;

        public Cowleg(double length,String color){
            this.length = length;
            this.color = color;
        }
        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        //非静态内部类的实现
        public void info(){
            System.out.println("当前 牛腿 的颜色:" + color + "  腿长:" + length);
            //直接访问 外部类的private 修饰的field
            System.out.println("本牛腿 所在的奶牛重量:" + weight);
        }
    }

    public void test(){
        Cowleg cowleg = new Cowleg(1.12,"屎黄色");
        cowleg.info();
    }

}
