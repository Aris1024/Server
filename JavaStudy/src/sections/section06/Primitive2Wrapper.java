package sections.section06;

/**
 * Created by apple on 15/5/24.
 */
public class Primitive2Wrapper {
    public void doSth(){
        System.out.println("下面程序演示了如何把基本类型对象转换为对应类包装对象");
        System.out.println("以及如何把一个字符串包装成包装类对象");

       boolean b1 = true;
        //通过构造器 把b1基本类型变量包装成包装类对象
        Boolean b1Obj = new Boolean(b1);

        int it = 5;
        //通过构造器把it 基本类型变量包装秤包装类对象
        Integer itObj = new Integer(it);

        //把一个字符串转换成一个Float 对象
        Float f1 = new Float("4.56");

        //把一个字符串转换成Boolean 对象
        Boolean bObj = new Boolean("false");

        //下面程序运行时将要出现 java.lang.NumberFormatException 异常
//        Long lObi = new Long("ddd");


        /*
        * 如果希望活得包装类对象中包装的基本类型变量，则可以使用包装类提供的XXXValue（）
        * 的实例方法。
        * */

        //去除Boolean 对象里的boolean变量
        boolean bb = bObj.booleanValue();

        //取出 Interge 对象里面的 int 变量
        int i = itObj.intValue();

        //取出Float 对象里面的 float 变量
        float f = f1.floatValue();

    }
}
