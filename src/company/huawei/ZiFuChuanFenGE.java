package company.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName ZiFuChuanFenGE
 * @Description •
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * @Author 王海峰
 * @Date 2019/4/1 21:04
 * @Version 1.0
 */
public class ZiFuChuanFenGE {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                String s = new String(sc.nextLine());
                if(s.length()%8 !=0 )
                    s = s + "00000000";

                while(s.length()>=8){
                    System.out.println(s.substring(0, 8));
                    s = s.substring(8);
                }
            }

        /*Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        s1 = s1.trim();
        s2 = s2.trim();


        if (s1 != null || s2 != null) {
            int temp1=0;
            int temp2=0;
            List<String> list = new ArrayList<>();

            if (!s1.isEmpty()) {
                 temp1 = s1.length() / 8;

                for (int i = 1; i < temp1+1; i++) {
                    String s = s1.substring((i - 1) * 8, i * 8);
                    list.add(s);
                }

                String s = s1.substring(temp1 * 8);
                StringBuilder stringBuilder = new StringBuilder(s);
                for (int i = s.length(); i < 8; i++) {
                    stringBuilder.append(0);
                }
                list.add(stringBuilder.toString());
            }
            if (!s2.isEmpty()) {

                temp2 = s2.length() / 8;
                for (int i = 1; i < temp2+1; i++) {
                    String s3 = s2.substring((i - 1) * 8, i * 8);
                    list.add(s3);
                }

                String s4 = s2.substring(temp2 * 8);
                StringBuilder stringBuilder1 = new StringBuilder(s4);
                for (int i = s4.length(); i < 8; i++) {
                    stringBuilder1.append(0);
                }
                list.add(stringBuilder1.toString());
            }


            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }
        }*/

    }

}
