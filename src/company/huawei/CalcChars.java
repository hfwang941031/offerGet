package company.huawei;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import javax.print.DocFlavor;
import java.util.*;

/**
 * @ClassName CalcChars
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/3 14:10
 * @Version 1.0
 */
public class CalcChars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.next();
            Map<Character, Integer> map = new TreeMap<>();
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z') || (temp >= '0' && temp <= '9') || temp == ' ') {
                    int value=1;
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + 1);
                    } else {
                        map.put(temp, value);
                    }
                }
            }
            Collection<Integer> values = map.values();
            List<Integer> list = new ArrayList<>(values);
            Collections.sort(list);
            Set<Character> set = map.keySet();
            for (int i = list.size() - 1; i >= 0; i--) {
                int max = list.get(i);
                Iterator<Character> iterator = set.iterator();
                while (iterator.hasNext()) {
                    char next = iterator.next();
                    if (map.get(next) == max) {
                        System.out.print(next);
                        iterator.remove();
                    }
                }

            }
            System.out.println();

        }


    }
}
