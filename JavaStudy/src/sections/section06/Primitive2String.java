package sections.section06;

/**
 * Created by apple on 15/5/24.
 */
public class Primitive2String {
    public void doSth(){
        System.out.println("包装类可以实现基本类型变量和字符串之间的转换");

        String intStr = "123";
        //把一个字符串转换成int 变量
        int it1 = Integer.parseInt(intStr);
        int it2 = new Integer(intStr);
        System.out.println(it2);

        String floatStr = "4.56";
        //把一个特定的字符串转换成 float变量
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = new Float(floatStr);
        System.out.println(ft2);

        //把一个 float变量转成 String变量
        String ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);

        //把一个double变量转换成String 变量
        String dbStr = String.valueOf(3.344);
        System.out.println(dbStr);

        //把一个boolean 变量转换成String变量
        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());

        testCompar();
    }

    public void testCompar(){
        //所有的包装类都提供了compare(a,b)方法来比较两个基本类型值的大小
        //包括比较两个boolean类型的值，两个boolean类型值进行比较时，true》false

        //我的JDK 是1.6的 怎么没有compare这个方法！？！？！？
        //java7 和 java 6 是啥意思？
        //java7 和JDK 有什么关系？
        //FU*K!

//        System.out.println(Boolean.compare(true,false));//输出 1
//        System.out.println(Boolean.compare(true,true));//输出 0
//        System.out.println(Boolean.compare(false,true));//输出 -1

    }
}
