package company.huawei;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName SimpleErrorRecord
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 20:40
 * @Version 1.0
 */
public class SimpleErrorRecord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (scanner.hasNext()) {
            String s = scanner.next();
            int lineNum = scanner.nextInt();
            String[] strings=s.split("\\\\");
            String name = strings[strings.length - 1];
            if (name.length() > 16) {
                name = name.substring(name.length() - 16);
            }
            String key = name + " " + lineNum;
            int value=1;
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, value);
            }


        }
        int counter=0;
        for (String string : map.keySet()) {
            counter++;
            if (counter > (map.size() - 8)) {
                System.out.println(string+" "+map.get(string));
            }
        }
    }
}
