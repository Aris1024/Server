package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
public class PrimitiveTransfer {
    public void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap 方法里 a是 " + a + " b是"+ b);
    }
}
