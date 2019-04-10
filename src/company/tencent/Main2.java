package company.tencent;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main2
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/5 19:18
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Character> list = new LinkedList<>();
        int n=scanner.nextInt();
        String s = scanner.next();
        if (s.length() == n) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                list.add(c);
            }
            if (list.size() == 2) {
                if (list.get(0) == list.get(1)) {
                    System.out.println(2);
                    return;
                } else {
                    System.out.println(0);
                    return;
                }
            } else if (list.size() == 1) {
                System.out.println(1);
                return;
            } else if (list.size() > 2) {
                for (int i = 1; i <=list.size()-2; i++) {
                        char pre = list.get(i - 1);
                        char current = list.get(i);
                        char post = list.get(i + 1);
                        if (pre != current) {
                            ((LinkedList<Character>) list).remove(i - 1);
                            i=0;
                            ((LinkedList<Character>) list).remove(i);
                            if (list.size() == 1) {
                                break;
                            } else if (list.size() == 2) {
                                if (list.get(0) == list.get(1)) {
                                    break;
                                } else {
                                    ((LinkedList<Character>) list).remove(0);
                                    i=0;
                                    ((LinkedList<Character>) list).remove(0);
                                    break;
                                }

                            }
                            i = 0;
                        } else if (current != post) {
                            ((LinkedList<Character>) list).remove(i);
                            i--;
                            ((LinkedList<Character>) list).remove(i + 1);
                            if (list.size() == 1) {
                                break;
                            } else if (list.size() == 2) {
                                if (list.get(0) == list.get(1)) {
                                    break;
                                } else {
                                    ((LinkedList<Character>) list).remove(0);
                                    ((LinkedList<Character>) list).remove(0);
                                    break;
                                }

                            }
                            i = 0;
                        } else {
                            continue;
                        }
                }
                System.out.println(list.size());

            }


        }

    }
}
