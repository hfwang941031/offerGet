package company.huawei;

import java.util.*;

/**
 * @ClassName SortIntByFlag
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/3 15:03
 * @Version 1.0
 */
public class SortIntByFlag {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            List<Integer> list = new ArrayList<>();

            int flag;
            for (int i = 0; i < N; i++) {
                list.add(scanner.nextInt());
            }
            flag = scanner.nextInt();
            if (flag == 0) {
                Collections.sort(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i)+" ");
                }
            } else {
                Collections.reverse(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i)+" ");
                }
            }
            list.clear();
            System.out.println();
        }
    }
}
