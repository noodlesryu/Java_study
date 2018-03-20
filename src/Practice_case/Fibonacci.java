package Practice_case;

import org.junit.Test;

/**
 * 斐波那契数列求n个值
 * n为要取的个数，这里手动定义，方便测试
 */
public class Fibonacci {


    /**
     * 递归法
     * fibonacci(i）中的i是索引，fibonacci()式从fib(1)算起然后递归相加
     * @param i
     * @return
     */
//    public static int fibonacci(int i) {
//        if ( i <= 0) {
//            return -1;
//        } else if (i  == 1 || i == 2) {
//            return 1;
//        } else {
//            return fibonacci(i - 1) + fibonacci(i - 2);
//        }
//    }
//    @Test
//    public void testFibonacci(){
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            System.out.println("fibonacci i="+i+"--value="+fibonacci(i));
//        }
//
//    }
    /**
     * 变量法
     */

//    public static void main(String[] args) {
//        int a = 1, b = 1,c = 0;
//        int n =5;
//        for (int i = 0; i < n; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            System.out.println(c);
//        }
//    }

    /**
     * 数组法
     * 数组法和变量法的思路一致
     */
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2]; }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t"); }}
}

