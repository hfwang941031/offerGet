package company.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName CalcCharNumInASCII
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 9:47
 * @Version 1.0
 */
public class CalcCharNumInASCII {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 0 && chars[i] <= 127) {
                set.add(chars[i]);
            }
        }
        System.out.println(set.size());
    }
}
