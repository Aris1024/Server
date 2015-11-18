package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
//传入可变参数
public class Varargs {

   public void test(int a,String... books){
       //books 被当成数组处理
       for (String tmp :books){
           System.out.println(tmp);
       }
       System.out.println("arg a is" + a);
   }
}
