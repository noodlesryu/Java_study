package Practice_case;

import org.junit.Test;

import java.util.Random;

public class Controlling_execution {


    /**
     * 从1打印到100
     */
    @Test
    public void test1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /**
     * 随机25个int数,并判断其大小
     */
    @Test
    public void test2() {
        Random rand = new Random(100);
        for (int i = 1; i <= 25; i++) {
            int a = rand.nextInt();
            int b = rand.nextInt();
            if (a > b) {
                System.out.println("a = " + a + ">" + "b = " + b);
            } else if (a < b) {
                System.out.println("a = " + a + "<" + "b = " + b);
            } else {
                System.out.println("a = b");
            }
        }
    }

    /**
     * 死循环
     */
    @Test
    public void test3() {
        while (true) {
            test2();
        }
    }

        /**
         * 嵌套循环打印素数
         * 不同思路的解法参考http://blog.csdn.net/sunsiyuan521/article/details/55254584
         */

     @Test
    public void test4() {
         int j ;
         int i;
         for (i = 2; i < 100 ; i++) {
             for(j = 2 ; j <= i;j++){
                 if(i%j == 0){
                     break;
                 }
             }
             if(j==i){
                 System.out.println(i);
             }
          }
        }

    /**
     * 三元运算符表示二进制
     * 不太懂题目要表达的意思，留待以后
     * 搬运一个比较简洁的答案http://blog.csdn.net/qq_35396447/article/details/52149960
     */
//    public static void main(String[] args){
//        int a = 0xAAAA;
//        int b = 0x5555;
//        int c;
//        c = a & b;
//        outCBit(c);
//        c = a | b;
//        outCBit(c);
//        c = ~a;
//        outCBit(c);
//        c = a ^ b;
//        outCBit(c);
//    }
//    private static void outCBit(int c) {
//        int d = 0x8000;
//        for (int i = 0; i < 16; i++) {
//            int out = (c | d) == c ? 1 : 0;//循环比较得出每一位
//            System.out.print(out);
//            d>>>=1;
//        }
//        System.out.println();
//    }

    /**
     * 增加两个参数，修改test方法
     */

//    public class E06_RangeTest {
//        static boolean test(int testval, int begin, int end) {
//            boolean result = false;
//            if(testval >= begin && testval <= end)
//                result = true;
//            return result;
//        }
//        public static void main(String[] args) {
//            System.out.println(test(10, 5, 15));
//            System.out.println(test(5, 10, 15));
//            System.out.println(test(5, 5, 5));
//        }
//

    /**
     * break
     */
    @Test
    public void test7(){
        for (int i = 1; i < 100 ; i++) {
            i = 99;//break;
            return;
        }
    }

    /**
     * swith开关
     */

    @Test
    public void  test8() {
        for (int i = 0; i < 3; i++) {
            switch (i){
                case 0:
                    System.out.println("垃圾Java");
                    break;
                case 1:
                    System.out.println("毁我青春");
                    break;
                case 2:
                    System.out.println("败我钱财");
                    break;
                }
            }

        }


    /**
     * 斐波那契数列求第n位的值，其他斐波那契问题或解法见Fibonacci.java
//      */
    @Test
   public void test9(){
        int n =6;
        if(n<=0){
            System.out.println(-1);
        }else if(n == 1 || n == 2){
            System.out.println(1);
        }else{
            int start = 3;
            int f = 1;
            int b = 1;
            while(start++<=n){//每次循环都把b和f右移一位
                b = b+f ;//b变成它右边那一位
                f = b-f;//f 变成b之前的值
            }
            System.out.println(b);
        }
   }

    /**
     * 吸血鬼数字
     * 本方法是顺向思维，即先有四位数，再拆分，四个数字组合相乘，
     * 若乘积与原数相等，则输出，并计算为一个吸血鬼数字。
     * 其他算法参考http://blog.csdn.net/tianmijieguo/article/details/46400911
     //
     */
//

    static int sum=0;//记录调用判断的次数
    static int a(int i) {
        return i/1000;    //求千位数字
    }
    static int b(int i) {
        return (i%1000)/100;//求百位
    }
    static int c(int i) {
        return ((i%1000)%100)/10;//求十位
    }
    static int d(int i) {
        return ((i%1000)%100)%10;//求个位
    }
    static int com(int i, int j) {   //形成10~99的两位数
        return (i * 10) + j;
    }
    static void productTest (int i, int m, int n) {
        sum++;
        if(m * n == i) System.out.println(i + " = " + m + " * " + n);
    }
    public static void main(String[] args) {
        for(int i = 1001; i < 9999; i++) {
            productTest(i, com(a(i), b(i)), com(c(i), d(i)));
            productTest(i, com(a(i), b(i)), com(d(i), c(i)));
            productTest(i, com(a(i), c(i)), com(b(i), d(i)));
            productTest(i, com(a(i), c(i)), com(d(i), b(i)));
            productTest(i, com(a(i), d(i)), com(b(i), c(i)));
            productTest(i, com(a(i), d(i)), com(c(i), b(i)));
            productTest(i, com(b(i), a(i)), com(c(i), d(i)));
            productTest(i, com(b(i), a(i)), com(d(i), c(i)));
            productTest(i, com(b(i), c(i)), com(d(i), a(i)));
            productTest(i, com(b(i), d(i)), com(c(i), a(i)));
            productTest(i, com(c(i), a(i)), com(d(i), b(i)));
            productTest(i, com(c(i), b(i)), com(d(i), a(i)));
        }
        System.out.println("总共调用判断的次数为："+sum);
    }
}












