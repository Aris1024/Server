package sections.section06;

/**
 * Created by zhangjingle on 15/11/18.
 */
public abstract class SpeedMeter {
    //转速
    private double turnRate;
    public SpeedMeter(){};

    //把返回车轮半径的方法定义成 抽象方法
    public abstract double getRadius();

    //定义 计算速度的方法
    public double getSpeed(){
        //速度 = 周长 * 转速
        double result = Math.PI * 2 * getRadius() * turnRate;
        System.out.println("speed:" + result);
        return result;

    }

    public double getTurnRate() {
        return turnRate;
    }

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }
}
