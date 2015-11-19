package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public class BetterPrinter implements Output {

    private String[] printData = new String[MAX_CACHE_LINE * 2];

    //用以记录当期那需要打印的作业数
    private int dataNum = 0;

    public void out(){
        //只要有作业就打印
        while (dataNum > 0){
            System.out.println("高速打印机正在打印:" + printData[0]);
            //把作业队列整体前移一位,并将剩下的作业数-1
            System.arraycopy(printData,1,printData,0,--dataNum);
        }
    }
    public void getData(String msg){
        if (dataNum > MAX_CACHE_LINE * 2){
            System.out.println("输出队列已满,添加失败.");
        }else {
            printData[dataNum++] = msg;
        }
    }
}
