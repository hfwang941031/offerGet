package company.huawei;

import java.util.*;

/**
 * @ClassName GetNoChongFuNum
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 9:30
 * @Version 1.0
 */
public class GetNoChongFuNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        Set<Character> set = new LinkedHashSet<>();
        for (int i = s.length() - 1; i >=0; i--) {
            set.add(s.charAt(i));
        }
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        set.clear();

    }
}
