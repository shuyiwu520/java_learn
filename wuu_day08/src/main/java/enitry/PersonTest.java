package enitry;

import org.junit.Test;

/**
 * 一、设计类，就是设计类的成员
 * 属性 = 成员变量 = field = 域、字段
 * 方法 = 成员方法 = 函数 = method
 * 创建类的对象 = 类的实例化 = 实例化类
 *
 * 二、类和对象的使用（面向对象思想落地实现）
 * 1.创建类，设计类的成员
 * 2。创建类的对象
 * 3.通过“对象.属性”或者“对象.方法”调用对象的结构
 * */

public class PersonTest  {

    @Test
    public void test(){
        /**创建person1对象*/
        Person person1 = new Person();

        /**调用对象的结构：属性、方法*/
        /**调用属性：“对象.属性”*/
        person1.name = "tom";
        person1.isMale = true;
        System.out.println("person1.name:" + person1.name);
        System.out.println("person1.age:" + person1.age);

        /**调用方法：“对象.方法”*/
        person1.eat();
        person1.sleep();
        person1.talk("zh");


       Person person2 = new Person();
       System.out.println(person2.name);

        Person person3 = person1;
        System.out.println(person3.name);

        person3.age = 10;
        System.out.println(person1.age);


    }

}

class Person{
    String name;
    int age = 1;
    boolean isMale;
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话 " + language);
    }
}