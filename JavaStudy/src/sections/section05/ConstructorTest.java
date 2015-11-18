package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
public class ConstructorTest {
    public String name;
    public int count;

    //提供自定义构造器，该构造器包含两个参数
    public ConstructorTest(String name,int count){
        //构造器里面的this 代表他进行初始化的对象
        //下面两行代码将传入的两个参数赋值给this 代表的对象
        this.name = name;
        this.count = count;
    }
}
