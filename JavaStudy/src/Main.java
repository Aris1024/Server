import sections.section05.A5_mian;
import sections.section05.Dog;
import sections.section06.A6_Main;

/**
 * Created by apple on 15/5/23.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("*******************************");

//        runClass5();
        runClass6();

        System.out.println("*******************************");

    }

    public static void runClass5(){
        //学习第六章 面向对象 上
        A5_mian a5_mian = new A5_mian();
        a5_mian.doRun();
//        Dog dog = new Dog();
//        dog.run();
    }

    public static void runClass6(){
        //学习第六章 面向对象 下
        A6_Main a6_main = new A6_Main();
        a6_main.doRun();
    }
}
