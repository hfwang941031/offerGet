package company.huawei;

import java.util.Scanner;

/**
 * @ClassName SimplePassword
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/3 8:51
 * @Version 1.0
 */
public class SimplePassword {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Y') {
                    char temp = Character.toLowerCase(chars[i]);
                    chars[i]= (char) (temp+1);
                    continue;
                } else if (chars[i] == 'Z') {
                    chars[i] = 'a';
                    continue;
                } else if (chars[i] >= '0' && chars[i] <= '9') {
                    continue;
                } else if (chars[i] == 'a' || chars[i] == 'b' || chars[i] == 'c') {
                    chars[i]='2';
                    continue;
                }else if (chars[i] == 'd' || chars[i] == 'e' || chars[i] == 'f') {
                    chars[i]='3';
                    continue;
                }else if (chars[i] == 'g' || chars[i] == 'h' || chars[i] == 'i') {
                    chars[i]='4';
                    continue;
                }else if (chars[i] == 'j' || chars[i] == 'k' || chars[i] == 'l') {
                    chars[i]='5';
                    continue;
                }else if (chars[i] == 'm' || chars[i] == 'n' || chars[i] == 'o') {
                    chars[i]='6';
                    continue;
                }else if (chars[i] == 'p' || chars[i] == 'q' || chars[i] == 'r'|| chars[i] == 's') {
                    chars[i]='7';
                    continue;
                }else if (chars[i] == 't' || chars[i] == 'u' || chars[i] == 'v') {
                    chars[i]='8';
                    continue;
                }else if (chars[i] == 'w' || chars[i] == 'x' || chars[i] == 'y'|| chars[i] == 'z') {
                    chars[i]='9';
                    continue;
                }
            }
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}
