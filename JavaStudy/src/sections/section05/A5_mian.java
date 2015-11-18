package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
public class A5_mian {
    public void doRun(){
//        run01();
//        run02();
//        run03();
//        run04();
//        run05();
//        run06();
//        run07();
//        run08();
//        run09();
//        run10();
//        run11();
//        run12();
//        run13();
        run14();
    }

    private void run01(){
        Person person = new Person();
        person.name = "张靖乐";
        person.say("hi zhang jing le");
        System.out.println(person.name);
    }

    private void run02(){
       // 所有使用 ThisInConstuctor 创建的对象 foo Field
        //都将被设 为6  所以下面的代码将输入 6
        System.out.println(new ThisInConstructor().foo);
    }

    private void run03(){
        ReturnThis returnThis = new ReturnThis();
        returnThis.grow().grow().grow();
        System.out.println(returnThis.age);
    }

    private void run04(){
        int a = 6;
        int b = 9;
        PrimitiveTransfer primitiveTransfer = new PrimitiveTransfer();
        primitiveTransfer.swap(a,b);
        System.out.println("交换 结束后 a is " + a + "b is" + b);

    }

    private void run05(){
        DataWrap dataWrap = new DataWrap();
        dataWrap.a = 6;
        dataWrap.b = 9;
        ReferenceTransfer referenceTransfer = new ReferenceTransfer();
        referenceTransfer.swap(dataWrap);
        System.out.println("交换后 a is" + dataWrap.a + " b is " + dataWrap.b);
    }

    private void run06(){    //可变参数 传参
        System.out.println("可变参数 传递");
        Varargs varargs = new Varargs();
        varargs.test(5,"我:张靖乐","老婆:常会青","儿子:张金庚");
    }

    private void run07(){
        System.out.println("递归");
        Recursive recursive = new Recursive();
        System.out.println(recursive.fn(10));

    }

    private void run08(){
        System.out.println("自定义构造器");
        ConstructorTest constructorTest = new ConstructorTest("张靖乐",100);
        System.out.println(constructorTest.name);
        System.out.println(constructorTest.count);
    }

    private void run09(){
        System.out.println("继承");
        //创建 APPLE 对象
        Apple apple = new Apple();
        //apple 对象 本身没有 weight Field 但是他的父类有这个属性
        apple.weight = 56;
        apple.info();
    }

    private void run10(){
        System.out.println("override");
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
    }

    public void run11(){
        new Wolf();
    }

    public void run12(){
        ConversionTest conversionTest = new ConversionTest();
        conversionTest.doConverson();
    }

    public void run13(){
        InstanceofTest instanceofTest = new InstanceofTest();
        instanceofTest.doInstance();
    }

    public void run14(){
        person1 p = new person1();
    }
}
