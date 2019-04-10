package company.huawei;

import java.util.*;

/**
 * @ClassName SortStringWithDicionaryOrder
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 10:28
 * @Version 1.0
 */
public class SortStringWithDicionaryOrder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> set = new TreeSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            list.add(s);
            /*set.add(s);*/
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
       /* Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

    }
}
