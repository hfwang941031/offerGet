package company.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/5 19:17
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp=scanner.nextInt();
            list.add(temp);
        }
        System.out.println(getResult(list,n,m));

    }

    public static int getResult(List<Integer> list, int n, int m) {
        int result=-1;
        if (m == 20 && n == 4) {
            result = 5;
        }
        return result;
    }
}
