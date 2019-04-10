package company.huawei;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main2
 * @Description TODO
 * @Author 王海峰
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s;
        while (!" ".equals(s=scanner.nextLine())) {

        }

    }
    /**
     * @MethodName: leftShift
     * @描述: str 字符串， b: 向左循环b次
     */
    private void leftShift(String str,int b) {
        int a = str.length();
        b%=a;
        StringBuffer outStr = new StringBuffer();
        for(int i=b;i<str.length();i++){
            outStr = outStr.append(String.valueOf(str.charAt(i)));
        }
        for(int i=0;i<b;i++){
            outStr = outStr.append(String.valueOf(str.charAt(i)));
        }
        System.out.println(outStr);
    }
}
