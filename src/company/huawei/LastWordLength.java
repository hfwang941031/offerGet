package company.huawei;

import java.util.Scanner;

/**
 * @ClassName LastWordLength
 * @Description 计算字符串最后一个单词的长度
 * @Author 王海峰
 * @Date 2019/4/1 20:06
 * @Version 1.0
 */
public class LastWordLength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings = s.split(" ");
        /*System.out.println(strings.length);*/
       /* for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }*/
       System.out.println(strings[strings.length-1].length());

    }
}
