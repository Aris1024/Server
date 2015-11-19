package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */

//定义一个 product 接口
interface Product{
    int getProduceTime();
}

//让printer 实现 Output接口 和 Product接口
public class Printer implements Output,Product{

    private String[] printData = new String[MAX_CACHE_LINE];

    //用于 当前 需要打印的 作业数
    private int dataNum = 0;



    public void out(){
        //只要还有作业 就继续打印
        while (dataNum > 0){
            System.out.println("打印机打印:" + printData[0]);

            //把作业整体前移一位,并将剩下的作业数减一
            System.arraycopy(printData,1,printData,0,--dataNum);
        }
    }

    public void getData(String msg){
        if (dataNum > MAX_CACHE_LINE){
            System.out.println("输出队列已满,添加失败.");
        }else {
            //把打印数据添加到队列里,已经保存的数据量+1
            printData[dataNum++] = msg;
        }
    }

    public int getProduceTime(){
        return 45;
    }

}
