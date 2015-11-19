package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public class OutputFactory {
    public Output getOutput(){
//        return new Printer();

        //BetterPrinter也实现了Output接口,因此也可以当成Output对象来是用,所以用下面折行

        return new BetterPrinter();
    }
}
