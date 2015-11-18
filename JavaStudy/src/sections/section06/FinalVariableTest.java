package sections.section06;

/**
 * Created by apple on 15/6/10.
 */
public class FinalVariableTest {
    //定义成员变量时指定默认值，合法
    final int a = 6;
    //
    final String str;
    final int c;
    final static double d;

    //既没有指定默认值，有没有在初始化块和构造器种指定初始值，下面的定义是不合法的
//    final char ch;

    //初始化块，可对没有指定默认值的实例Field 指定初始值
    {
        //在初始化块种为实例Field 指定初始值，合法
        str = "Hello";

        //定义 a Field 时已经指定了默认值，不能为a重新赋值
//        a = 9;
    }

    //静态初始化块，可以对没有指定默认值的类Field指定初始值
    static
    {
        d=5.6;
    }

    //构造器，可以对既没有指定默认值，有没有再初始化块种指定初始值的实例Field指定初始值
    public FinalVariableTest(){
        //如果初始化块中对str指定了初始值
        //则构造器中不能对final变量重新赋值，下面语句非法
//        str = "java";
        c = 5;
    }
}
