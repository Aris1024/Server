package sections.section06;

/**
 * Created by apple on 15/5/24.
 */
public class A6_Main {
    public void doRun(){
//        run01();
//        run02();
//        run03();
//        run04();
//        run05();
//         run06();
//        run07();
//        run08();
        run09();
    }

    public void run01(){
        Primitive2Wrapper p = new Primitive2Wrapper();
        p.doSth();
    }
    public void run02(){
        System.out.println("自动装箱 和 自动拆箱");
        AutoBoxingUnboxing autoBoxingUnboxing = new AutoBoxingUnboxing();
        autoBoxingUnboxing.doSth();
    }

    public void run03(){
        Primitive2String p = new Primitive2String();
        p.doSth();
    }

    public void run04(){
        System.out.println("学习toStirng用法");
        ToStringTest toStringTest = new ToStringTest();
        toStringTest.doSth();
    }

    public void run05(){
        System.out.println("学习 == 和 equals 方法");
        EqualTest equalTest = new EqualTest();
        equalTest.doRun();
    }
    public void run06(){
        //定义一个nullAccessStatic 变量，赋值为null
        NullAccessStatic nullAccessStatic = null;
        //null 对象调用所属静态类的方法
        nullAccessStatic.test();

    }

    public void run07(){
        JavaTest javaTest = new JavaTest();
        javaTest.doRun();
    }

    public void run08(){
        System.out.println("创建单例 Singelton");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("下面将要输出 true");
        System.out.println(s1 == s2);
        //下面这一行会报错，因为单例中的构造方法 为private。
        // 目的就是防止其他方法调用创建该对象,保证单例只产生一个
//        Singleton singleton = new Singleton();
    }

    public void run09(){
        FinalReferenceTest finalReferenceTest = new FinalReferenceTest();
        finalReferenceTest.doRun();
    }
}
