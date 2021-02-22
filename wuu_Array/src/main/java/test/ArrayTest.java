package test;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void NullPointerException(){
        System.out.println("========== start NullPointerException ================");
        int[] array = null;
        System.out.println(array[0]);

    }

    @Test
    public void arrayException(){
        System.out.println("================== start arrayException function ==============");
        int[] array = new int[2];
        System.out.println(array[-1]);
    }

    @Test
    public void SortTest(){
        System.out.println("=========== start SortTest =============");
        int[] numbers = {5, 900, 1, 5, 77, 30, 64, 700};
        //{1，5，5，30，64，700，900}
        Arrays.sort(numbers);
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
       int index =  Arrays.binarySearch(numbers,30);
        if (index < 0){
            System.out.println("没有找到指定的元素");
        }else {
            System.out.println("该元素在数组中的索引值是：" + index);
        }
    }

    @Test
    public void test(){
        System.out.println("============== start test array function ==============");
        int a[] = new int[5];
        System.out.println(a[3]);
    }

    @Test
    public void test2(){
        int[] s;
        s = new int[10];

        for(int i = 0; i < 10; i++){
            s[i] = 2*i + i;
            System.out.println(s[i]);
        }
    }


}
