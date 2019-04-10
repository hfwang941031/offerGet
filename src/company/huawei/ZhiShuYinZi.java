package company.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName ZhiShuYinZi
 * @Description 质数因子
 * @Author 王海峰
 * @Date 2019/4/2 8:21
 * @Version 1.0
 */
public class ZhiShuYinZi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            int counter=0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    counter++;
                }
                if (counter > 2) {
                    break;
                }
            }
            if (counter == 2) {
                list.add(Integer.valueOf(Long.toString(n)));
                break;
            }
            if (n % i == 0) {
                n = n / i;
                list.add(i);
                i = 1;
            } else {
                continue;
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
    }
}
