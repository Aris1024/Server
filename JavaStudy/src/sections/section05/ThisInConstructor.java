package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
public class ThisInConstructor {
    //定义 一个 名字为 foo 的field
    public int foo;
    public ThisInConstructor(){
        //在构造器里 定义一个 foo 变量
        int foo = 0;

        //使用 this 代表此构造器 进行初始化的对象
        //下面 代码 将会把刚创建对象的foo Field 设置 为 6
        this.foo = 6;

    }
}
