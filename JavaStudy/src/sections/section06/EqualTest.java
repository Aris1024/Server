package sections.section06;

/**
 * Created by apple on 15/5/24.
 */
public class EqualTest {
    public void doRun(){
        int it = 65;
        float f1 = 65.0f;
        //下面输出true
        System.out.println("65 和 65.0f 是否相等：" + (it == f1));

        char ch = 'A';
        //下面输出 false
        System.out.println("65 和 'A' 是否相等" + (it == ch));

        String st1 = new String("hello");
        String st2 = new String("hello");
        //下面输出false
        System.out.println("str1 和 str2 是否相等：" + (st1 == st2));
        //下面输出true
        System.out.println("str1 是否 equals str2" + (st1.equals(st2)));

        //由于java.lang.String 与 EqualTest类么有继承关系
        //所以下面语句导致编译错误
//        System.out.println("hello" == new EqualTest());

    }
}
