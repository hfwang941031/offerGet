package company.huawei;

import java.util.Scanner;

/**
 * @ClassName ReverseSentence
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 10:13
 * @Version 1.0
 */
public class ReverseSentence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split("\\s");
        String[] newString = new String[strings.length];
        for (int i = strings.length - 1; i >= 0; i--) {
            newString[strings.length - 1 - i] = strings[i];
        }
        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i]+" ");
        }
    }
}
