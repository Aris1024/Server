package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */

interface intefaceA{
    int PROP_A = 5;
    void testA();
}

interface  interfaceB{
    int PROP_B = 6;
    void testB();
}

interface interfaceC extends intefaceA,interfaceB
{
    int PROP_C = 7;
    void testC();

}

public class InterfaceExtendsTest {
    public void doRun(){
        System.out.println(interfaceC.PROP_A);
        System.out.println(interfaceC.PROP_B);
        System.out.println(interfaceC.PROP_C);
    }
}
