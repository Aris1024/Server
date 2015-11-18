package sections.section05;

/**
 * Created by apple on 15/5/23.
 */
public class ReturnThis {
    public int age;

    public ReturnThis grow(){
        age++;
        return this;
    }
}
