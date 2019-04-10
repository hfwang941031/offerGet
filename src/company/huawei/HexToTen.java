package company.huawei;

import java.util.Scanner;

/**
 * @ClassName HexToTen
  @Description
 * 16进制转10进制
 *
 * @Author 王海峰
 * @Date 2019/4/1 21:54
 * @Version 1.0
 */
public class HexToTen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next().substring(2);
            int s2 = Integer.parseInt(s1,16);
            System.out.println(s2);
        }
    }
}
