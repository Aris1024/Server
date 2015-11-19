package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public interface Output {
    //接口里定义的Field 只能是常量
    int MAX_CACHE_LINE = 50;

    //接口里定义的只能是 public 的抽象方法
    void out();
    void getData(String msg);
}
