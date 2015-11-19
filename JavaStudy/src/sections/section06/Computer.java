package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public class Computer {
    private Output output;
    public Computer(Output output){
        this.output = output;
    }
    //定义一个模拟字符串输入的方法
    public void keyIn(String msg){
        output.getData(msg);
    }

    //定义一个模拟打印的方法
    public void print(){
        output.out();
    }

    //Computer 类完全与 Printer 类分离,只是与 接口Output 耦合.
    //Computer不再负责创建按Output对象

}
