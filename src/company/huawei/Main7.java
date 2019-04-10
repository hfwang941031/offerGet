package company.huawei;

import java.util.*;

/**
 * @ClassName Main7
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/4 16:01
 * @Version 1.0
 */
public class Main7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        List<String> hefalist = new ArrayList<>();
        List<String> feifaList = new ArrayList<>();
        Set<String> hefaquchong = new LinkedHashSet<>();
        Set<String> res = new LinkedHashSet<>();
        Set<String> order = new TreeSet<>();

        while (scanner.hasNextLine()) {
            String s=scanner.nextLine();

            if (s.trim().equals("")) {
                break;
            }
            if (s.length() <= 64) {
                counter++;
                int hefaNum=0;
                for (int i = 0; i < s.length(); i++) {
                    char temp = s.charAt(i);
                    if ((temp >= '0' && temp <= '9') || (temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')) {
                        hefaNum++;
                    }
                }
                if (hefaNum == s.length()) {
                    hefalist.add(s);
                }else {
                    feifaList.add(s);
                }
                if (counter > 100) {
                    break;
                }
            }
        }
        //合法去重
        for (int i = 0; i < hefalist.size(); i++) {
            hefaquchong.add(hefalist.get(i));

        }
        //左移去重
        for (int i = 0; i < hefalist.size(); i++) {
            String temp = hefalist.get(i);
            int size = temp.length();
            if (size == 10) {
                res.add(temp);
            } else if (size < 10) {
                int yushu=10%size;
                String s1 = temp.substring(0, yushu);
                String s2 = temp.substring(yushu, size);
                String result=s2+s1;
                res.add(result);
            } else if (size > 10) {
                int yushu=size%10;
                String s1 = temp.substring(0, yushu);
                String s2 = temp.substring(yushu, size);
                String result = s2 + s1;
                res.add(result);
            }
            //合法去重左移排序
            Iterator<String> iterator = res.iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                order.add(next);
            }

        }
        //打印结果1
        Iterator iterator = hefaquchong.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println();
        //打印结果2
        for (int i = 0; i < feifaList.size(); i++) {
            System.out.print(feifaList.get(i)+" ");
        }
        System.out.println();
        System.out.println();
        //打印结果3
        Iterator<String> iterator1 = res.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        System.out.println();
        //打印结果4
        Iterator<String> iterator2 = order.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next()+" ");
        }
        System.out.println();



    }
}
