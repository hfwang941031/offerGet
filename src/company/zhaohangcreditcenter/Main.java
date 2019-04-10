package company.zhaohangcreditcenter;

import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/9 18:35
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int cha=n-6;
        System.out.println((int) Math.pow(2,cha)%666666666);
    }
}
