package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
class DataWrap{
    public int a;
    public int b;
}
public class ReferenceTransfer {
    public void swap(DataWrap dataWrap){
        int tmp = dataWrap.a;
        dataWrap.a = dataWrap.b;
        dataWrap.b = tmp;

        System.out.println("in swap, a is"+ dataWrap.a + " b is" + dataWrap.b);
        dataWrap = null; // 设置为 null 不会影响 原有对象的操作
    }
}
