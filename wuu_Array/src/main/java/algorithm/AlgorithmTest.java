package algorithm;

import org.junit.Test;

public class AlgorithmTest {
    @Test
    public void binaryFindTest(){
        System.out.println("============== start algorithm  test ======================");
        int[] array = new int[]{-99, -54, -2, 0, 33, 43, 256, 999};
        boolean isFlag = true;
        int number = 266;
        int head = 0;       //头索引位置
        int end = array.length - 1;     //尾索引位置
        while (head <= end){
         int middle = (head + end) / 2;
         if (array[middle] == number){
             System.out.println("找到指定元素，该元素的索引值为：" + middle);
             isFlag = false;
             break;
         }else if (array[middle] > number){
             end = middle - 1;
         }else {
             head = middle + 1;
         }
        }

        if (isFlag){
            System.out.println("未找到指定元素");
        }

    }
}
