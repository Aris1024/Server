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
//        run09();
//        run10();
//        run11();
//        run12();
//        run13();
//        run14();
//        run15();
        run16();
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

    public void run10(){
        Shape s1 = new Triangle("黑色",3,4,5);
        Shape s2 = new Circle("黄色",3);

        System.out.printf(s1.getType());
        System.out.println(s1.calPerimeter());

        System.out.printf(s2.getType());
        System.out.println(s2.calPerimeter());

    }

    public void run11(){
        CarSpeedMeter carSpeedMeter = new CarSpeedMeter();
        carSpeedMeter.setTurnRate(15);
        System.out.println(carSpeedMeter.getSpeed());
    }

    public void run12(){
        InterfaceExtendsTest interfaceExtendsTest = new InterfaceExtendsTest();
        interfaceExtendsTest.doRun();
    }

    public void run13(){
        //创建一个Printer对象,当成Output使用
        Output output = new Printer();

        output.getData("轻量级Java EE 企业应用实战");
        output.getData("疯狂Java 讲义");
        output.out();

        output.getData("疯狂Android 讲义");
        output.getData("疯狂Ajax 讲义");
        output.out();

        //创建一个 Printer 对象,当成 product 使用
        Product product = new Printer();
        System.out.println(product.getProduceTime());

        //所有接口类型的引用变量都可以直接赋给Object类型的变量
        Object object = product;
    }

    public void run14(){
        //简单工厂模式
        OutputFactory outputFactory = new OutputFactory();
        Computer computer = new Computer(outputFactory.getOutput());
        computer.keyIn("请谅解 java EE 企业应用实战");
        computer.keyIn("疯狂java 讲义");
        computer.print();
    }

    public void run15(){
        ProcessArray processArray = new ProcessArray();
        int[] target = {3,-4,6,4};
        //第一次处理数组,具体处理行为取决于PrintCommand
        processArray.process(target,new PrintCommand());
        System.out.println("----------");
        processArray.process(target,new AddCommand());
    }

    public void run16(){
        Cow cow = new Cow(378.9);
        cow.test();
    }
}
