package sections.section06;

/**
 * Created by apple on 15/5/24.
 */
public class AutoBoxingUnboxing {
    public void doSth(){
        //直接把一个基本类型变量赋值给Interger对象
        Integer inObj = 5;

        //直接把一个boolean类型变量赋值给一个Object类型变量
        Object boolObj = true;

        //直接把一个Interger对象赋值给int类型变量
        int it = inObj;
        if (boolObj instanceof Boolean){
            //先把Object 对象强制类型转换为Boolean类型，再赋值给boolean 变量
            boolean b = (Boolean)boolObj;
            System.out.println(b);
        }
    }
}
