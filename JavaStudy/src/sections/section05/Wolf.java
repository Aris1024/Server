package sections.section05;

/**
 * Created by apple on 15/5/23.
 */

class Creature
{
    public Creature(){
        System.out.println("Creatur 无参数构造器");
    }
}

class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal 带一个参数的构造器，该动物的name 为：" + name);
    }

    public Animal(String name,int age){
        //使用this 调用同一个重载的构造器
        this(name);
        System.out.println("Animal 带两个参数的构造器 其age为" + age);
    }
}

public class Wolf extends Animal{
    public Wolf(){
        //显式 调用父类有两个参数的构造器
        super("灰太狼",3);
    }
}
