package company.huawei;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @ClassName No13IsWeekDay
 * @Description
 * 计算13日出现在某个星期的次数（在给定的n年时间中），
 * 这个时间段为1900年1月1日到1900+N-1年12月31日
 *
 *
 * 输入描述
 * 1 0
 * 第一个参数为years，表示距离1900年1月1日的年数
 * 第二个参数为weeks，表示星期数（分别用0-6代表星期日到星期6）
 * 输出描述
 * 13日出现在星期数为weeks的次数，若异常失败输出-1
 *
 *
 * 输入
 * 1 0
 * 输出
 * 1
 * @Author 王海峰
 * @Date 2019/4/1 15:43
 * @Version 1.0
 */
public class No13IsWeekDay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int years=scanner.nextInt();
        int weeks = scanner.nextInt();
        if (years > 400 || weeks > 6) {
            System.out.println(-1);
            return;
        }
        if (weeks == 0) {
            weeks=7;
        }
        int count=0;
        for (int i = 1; i <=years; i++) {
            for (int j = 1; j < 13; j++) {
                LocalDate localDate = LocalDate.of(1900 + years - 1, j, 13);
                DayOfWeek weekday=localDate.getDayOfWeek();
                int res=weekday.getValue();
                if (res == weeks) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
