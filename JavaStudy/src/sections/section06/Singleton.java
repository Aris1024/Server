package sections.section06;

/**
 * Created by apple on 15/6/9.
 */
public class Singleton {
    //使用一个变量来缓存曾经创建的一个实例
    public static Singleton instance;

    //对构造器使用private修饰，隐藏该构造器
    private Singleton(){}

    //提供一个静态方法，用于返回Singelton实例
    //该方法可以加入自定义控制，保证只产生一个Singelton对象
    public static Singleton getInstance(){
        //如果instance 为 null，则表明还不曾创建Singelton 对象
        //如果instance不为null，则说明曾经创建过Singelton 对象，将不会创建新的实例
        if (instance == null){
            instance = new Singleton();
        }
        return instance;


    }
}
