package sections.section06;

/**
 * Created by apple on 15/6/9.
 */
public class JavaTest {
    public void doRun(){
        int [] arr = {0,10,20};
        f2(arr);
        System.out.println(""+ arr[0] +"  " + arr[1]+"  "+arr[2]);
    }
    private void f2(int [] arr){
        arr[2] = arr[2] + 10;
        int[] arr1 = arr;
        arr1[0] = arr[0] + 2;
        arr = new int[]{1,2,3};
        arr[0] += 10;
    }
}
