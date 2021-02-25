package binarySearch;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void test(){
        System.out.println("================ test binarySearch function ============");
        int[] array = {1, 3, 8, 10, 11, 67, 100};
        int index = binarySearch(array, 100);
        System.out.println("the result is: " + index);
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right){/**说明需要继续查找*/
            int middle = (left + right) / 2;
            if(array[middle] == target){
                return middle;
            }else if (array[middle] > target){
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return -1;
    }

}
