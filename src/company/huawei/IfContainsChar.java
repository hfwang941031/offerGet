package company.huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName IfContainsChar
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/1 20:17
 * @Version 1.0
 */
public class IfContainsChar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String c=scanner.next();
        if (s != null && s.length() > 0) {
            Pattern pattern=Pattern.compile(c,Pattern.CASE_INSENSITIVE);
            int counter=0;
            Matcher match=pattern.matcher(s);
            while(match.find())
            {
                counter++;
            }
            System.out.print(counter);
        }

    }
}
