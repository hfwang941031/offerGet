package company.huawei;

import java.util.Scanner;

/**
 * @ClassName ReverseString
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 10:10
 * @Version 1.0
 */
public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuffer.append(s.charAt(i));
        }
        System.out.println(stringBuffer.toString());
    }
}
