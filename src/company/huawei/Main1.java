package company.huawei;

import java.util.*;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author 王海峰
 * @Version 1.0
 */
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<List<String>> list = new ArrayList<>();
        List<String> res = new ArrayList<>();

        int n = scanner.nextInt();
        String s;
        while (!"".equals(s=scanner.nextLine())) {
            String[] chars = s.split(",");
            List<String> linkList = new LinkedList<>(Arrays.asList(chars));
            list.add(linkList);
        }
        int N = list.size()-1;
        /*int[] length = new int[N];*/
        while (true) {
            /*int count=0;*/
            for (int i = 0; i < N; i++) {
                if (list.get(i).isEmpty()) {
                    /*count++;*/
                    continue;
                }
                if (list.get(i).size() >= 3) {
                    for (int j = 0; j < 3; j++) {
                        res.add(list.get(i).get(j));
                        list.get(i).remove(j);
                    }
                } else {
                    for (int m = 0; m < list.get(i).size(); m++) {
                        res.add(list.get(i).get(n));
                    }
                }
                for (int z = 0; z < res.size(); z++) {
                    System.out.println(res.get(z));
                }
            }
        }
    }
}
