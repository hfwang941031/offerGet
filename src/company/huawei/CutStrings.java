package company.huawei;

import java.util.Scanner;

/**
 * @ClassName CutStrings
 * @Description
 * 2018.4.18 华为笔试 NO.1
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
 * 但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，
 * 输入"我ABC汉DEF"6，应该输出为"我ABC"而不是"我ABC+汉的半个"。
 *
 * 输入
 * 我ABC汉DEF
 * 6
 * 输出
 * 我ABC
 *
 * @Author 王海峰
 * @Date 2019/4/1 15:27
 * @Version 1.0
 */
public class CutStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int counter=0;
        int i=0;
        char[] chars = s.toCharArray();
        while (counter < n) {
            if (chars[i] > 128) {
                counter+=2;
                if (counter <= n) {
                    i++;
                }

            } else {
                counter++;
                if (counter <= n) {
                    i++;
                }
            }
        }
        System.out.println(s.substring(0,i));
    }
}
