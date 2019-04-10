package company.zhaohangcreditcenter;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName IfContainsLongestSubString
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/8 16:58
 * @Version 1.0
 */
public class IfContainsLongestSubString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Stack<String> stack = new Stack<>();
        String temp="";
        int len=s.length();
        for (int i = 0; i < s.length(); i++) {
            temp += s.charAt(i);
            if (s.contains(temp)) {
                stack.push(temp);
                int tempsize = temp.length();
                if (len >= tempsize && len % tempsize == 0) {
                    int yushu=len/tempsize;
                    String temp1 = "";
                    for (int j = 0; j < yushu; j++) {
                        temp1+=temp;
                    }
                    if (temp1.equals(s)) {
                        break;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(false);
        } else {
            if (s.equals(stack.pop())) {
                System.out.println(false);
            } else {
                System.out.println(stack.pop());
            }

        }

    }
}
