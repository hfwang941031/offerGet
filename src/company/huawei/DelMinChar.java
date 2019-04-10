package company.huawei;

import java.util.*;

/**
 * @ClassName DelMinChar
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/3 9:20
 * @Version 1.0
 */
public class DelMinChar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> map = new LinkedHashMap<>();
        /*char[] chars = s.toCharArray();*/
        for (int i = 0; i < s.length(); i++) {
            int value=1;
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), value);
            }
        }
        Collection<Integer> al = map.values();
        int min = Collections.min(al);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != min) {
                stringBuffer.append(s.charAt(i));
            }
        }
        System.out.println(stringBuffer.toString());



    }
}
