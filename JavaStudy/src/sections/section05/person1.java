package sections.section05;

/**
 * Created by apple on 15/5/24.
 */
public class person1 {
    //下面定义一个初始化块
    {
        int a = 6;
        //在初始化块中
        if (a > 4){
            System.out.println("Person 初始化 块，局部变量a》4");
        }
        System.out.println("Person 的初始化块");
    }

    {
        System.out.println("第二个初始化块");
    }

    //定义无参数构造器
    public person1(){
        System.out.println("Person 的 无参数构造器");
    }
}
