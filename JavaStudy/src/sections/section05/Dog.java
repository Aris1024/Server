package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
public class Dog {
    //定义一个 jump方法
    public void jump(){
        System.out.println("正在调用 jump 方法");
    }

    //定义一个 run 方法
    public void run(){
        jump();
        System.out.println("正在调用 run 方法");
    }
}
