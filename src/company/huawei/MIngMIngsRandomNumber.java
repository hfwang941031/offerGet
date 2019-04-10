package company.huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName MIngMIngsRandomNumber
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/1 20:51
 * @Version 1.0
 */
public class MIngMIngsRandomNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        /*int[] array = new int[n];*/
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            /*array[i] = scanner.nextInt();*/
            int temp = scanner.nextInt();
            set.add(temp);
        }
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*for (int i = 0; i < set.size(); i++) {
            System.out.println(set.);
        }*/
    }
}
