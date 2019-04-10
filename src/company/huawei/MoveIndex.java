package company.huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName MoveIndex
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 14:32
 * @Version 1.0
 */
public class MoveIndex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            int rightleft=0;
            int updown=0;
            String[] strings = s.split(";");
        /*for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }*/
            Pattern pattern = Pattern.compile("[AWSD]\\d+");

            for (int i = 0; i < strings.length; i++) {
                Matcher matcher = pattern.matcher(strings[i]);
                while (matcher.find()) {


                    int temp = Integer.parseInt(strings[i].substring(1, strings[i].length()));
                    if (strings[i].startsWith("A")) {

                        rightleft-=temp;
                        break;
                    } else if (strings[i].startsWith("D")) {

                        rightleft+=temp;
                        break;
                    } else if (strings[i].startsWith("W")) {
                        updown+=temp;
                        break;
                    } else if (strings[i].startsWith("S")) {
                        updown-=temp;
                        break;
                    }
                }
            }
            System.out.println(rightleft+","+updown);
        }

    }
}
