package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
public class Recursive {
    public int fn(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {
            return 2 * fn(n - 1) + fn(n - 2);
        }


    }
}
