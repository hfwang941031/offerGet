package company.huawei;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @ClassName QuZheng
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 8:49
 * @Version 1.0
 */
public class QuZheng {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();

        double f = Math.round(d);
        int i = (int) f;
        System.out.println(i);
    }
}
