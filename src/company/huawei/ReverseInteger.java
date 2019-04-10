package company.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName ReverseInteger
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 10:02
 * @Version 1.0
 */
public class ReverseInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        List<Character> list = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
