package company.huawei;

import java.util.*;

/**
 * @ClassName MergeTableRecord
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 9:03
 * @Version 1.0
 */
public class MergeTableRecord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }
    }
}
