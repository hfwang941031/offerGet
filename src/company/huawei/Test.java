package company.huawei;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 9:23
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String[] chars = s.split("");
        for (int i = 0; i < chars.length; i++) {

            System.out.println(Integer.parseInt(chars[i]));
        }
    }
}
