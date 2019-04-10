package company.huawei;

import java.util.Scanner;

/**
 * @ClassName PasswordVerify
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 21:07
 * @Version 1.0
 */
public class PasswordVerify {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (isShorterThan8(s) && checkCharKinds(s) && checkRepeat(s)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    public static boolean isShorterThan8(String s) {
        if (s == null || s.length() < 8) {
            return false;
        }
        return true;
    }

    public static boolean checkCharKinds(String s) {
        int digit=0,lowercase=0,upcase=0,others=0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowercase=1;
                continue;
            }
            else if (chars[i] >= '0' && chars[i] <= '9') {
                digit=1;
                continue;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                upcase = 1;
                continue;
            } else {
                others=1;
                continue;
            }
        }
        int sum=upcase+lowercase+digit+others;
        if (sum >= 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkRepeat(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            String substr = s.substring(i, i + 3);
            if (s.substring(i + 1).contains(substr))
                return false;
        }
        return true;
    }
}
