package sections.section05;

/**
 * Created by apple on 15/5/24.
 */
public class ConversionTest {
    public void doConverson(){
        System.out.println("强制类型转换");

        double d = 13.4;
        long l = (long)d;
        System.out.println(l);

        int in = 5;
        //下面这行代码 编译的时候会出错，因为 把一个数值类型变量转换为 boolean 类型
//        boolean b = (boolean)in;

        Object obj = "hello";
        //obj 编译时的类型是Object，是String的父类，可以强制类型转换
        // 而且 obj 类型 实际上是 是String，所以运行时也可以通过
        String objStr = (String)obj;
        System.out.println(objStr);

        Object objPri = new Integer(5);
        //objPri 变量的编译时类型为 Object ，是String类型的父类
        //可以强制类型转换，而objPri 变量的类型实际上是Integer 类型
        //所以下面这行代码运行时会引发ClassCastException 异常
//        String str = (String)objPri;
        if (objPri instanceof String){  //添加判断 是否可以转换，避免异常
            String str = (String)objPri;
        }
    }
}
