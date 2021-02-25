package enitry;

/**
 * 类中方法的声明和使用
 *
 * 方法：描述类应具有的功能
 * 比如：
 *
 * 1.举例:
 * public void eat(){}
 * public void sleep(int hour){}
 *
 *
 * 2.方法的声明：权限修饰符 返回类型 方法名( 形参列表 ){
 *          方法体：具体的操作逻辑
 *       }
 *
 *
 * 3.说明：
 *      3.1关于权限修饰符：
 *          java规定的4种权限修饰符：private、public、
 *      3.2返回值类型：有返回值 vs 没有返回值
 *          3.2.1
 *
 *          3.2.2我们定义方法的返回值？
 *              1.题目要求
 *              2.开发经验：具体问题，具体分析
 *     3.3方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
 *
 * */

public class ConsumerTest {
}

/**客户类*/
class Customer{
    String name;
    int age;
    boolean isMale;

    public void eat(){
        System.out.println("客户吃饭");
    }

    public String  getName(){
        return name;
    }

}
