package company.huawei;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main6
 * @Description 华为2019.4.3笔试第一题
 * @Author 王海峰
 * @Date 2019/4/4 14:08
 * @Version 1.0
 */
public class Main6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s=null;
        String kong = scanner.nextLine();
        List<LinkedList<String>> list = new LinkedList<>();
        List<String> res = new ArrayList<>();
        while (scanner.hasNextLine()) {
            s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }
            String[] strings = s.split(",");
            List<String> arrayList = new LinkedList<>();
            for (int i = 0; i < strings.length; i++) {
                arrayList.add(strings[i]);
            }
            list.add((LinkedList<String>) arrayList);
        }
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                List<String> temp = list.get(i);
                if (temp.size() == 0) {
                    list.remove(i);
                } else {
                    if (temp.size() >= N) {
                        int counter=0;
                        while (true) {
                            counter++;
                            res.add(temp.get(0));
                            ((LinkedList<String>) temp).remove();
                            if (counter >= N) {
                                break;
                            }
                        }
                    } else {
                        int counter1 = 0;
                        int length=temp.size();
                        while (true) {
                            counter1++;
                            res.add(temp.get(0));
                            ((LinkedList<String>) temp).remove();
                            if (counter1 >= length) {
                                break;
                            }
                        }
                        ((LinkedList<LinkedList<String>>) list).remove(temp);
                    }
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            if (i == res.size()-1) {
                System.out.print(res.get(i));
            } else {
                System.out.print(res.get(i)+",");
            }
        }
        System.out.println();
    }
}
