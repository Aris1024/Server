package sections.section05;

/**
 * Created by apple on 15/5/24.
 */
public class InstanceofTest {
   public void doInstance(){
       //声明 hello 时使用Object类，则hello的编译类型是Object
       //Object 是所有类的父类，但是hello变量的实际类型是String
       Object hello = "hello";
       //String 是Object类的子类，可以进行instanceof 运算。返回ture
       System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object));

       //返回 true
       System.out.println("字符串是否是String类的实例：" + (hello instanceof String));

       //Math 是Object类的子类，可以进行instanceof 运算。返回false
       System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));

       //String 实现了 Comparable接口，所以返回true
       System.out.println("字符串是否是 Comparable 接口实例：" + (hello instanceof Comparable));

       String a = "hello";
       //String 类 既不是Math类，也不是Math类的父类
       //所以下面的代码无法编译通过
//       System.out.println("字符串是否是 Math 类的实例：" + (a instanceof Math));
   }

}
