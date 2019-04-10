package company.huawei;

import java.util.Scanner;

/**
 * @ClassName NumOf1WhileTransTenToTwo
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 10:51
 * @Version 1.0
 */
public class NumOf1WhileTransTenToTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        System.out.println(count);

    }
}
