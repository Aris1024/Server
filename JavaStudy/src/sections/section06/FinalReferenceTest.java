package sections.section06;

import java.util.Arrays;

/**
 * Created by apple on 15/6/10.
 */

class Person{
    private int age;
    public Person(int age){
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class FinalReferenceTest {
    public void doRun(){
        //final 修饰数组变量，iArr是一个引用变量
        final int[] iArr = {5,6,12,9};
        System.out.println(Arrays.toString(iArr));

        //对数组元素进行排序，合法
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));

        //对数组元素进行赋值，合法
        iArr[2] = -8;
        System.out.println(Arrays.toString(iArr));

        //对iArr重新赋值，非法！
//        iArr = null;

        final Person person = new Person(45);
        person.setAge(23);
        System.out.println(person.getAge());
//        person = null;

    }

}
