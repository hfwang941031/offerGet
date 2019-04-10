package company.zhaohangcreditcenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName FindIlleaglechars
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/8 19:02
 * @Version 1.0
 */
public class FindIlleaglechars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        /*List<Integer> list = new ArrayList<>();*/
        /*getResult(n, list);*/
        /*int res=1;*/
       /* for (int i = 0; i < list.size(); i++) {
            res *= list.get(i);
        }*/
        System.out.println(getResult(n));


    }

    public static int  getResult(int n) {
        /*if (n / 2 == 1) {
            list.add(n);
            return;
        }
        if (n % 2 == 0) {
            int n3 = (n + 2) / 2;
            int n4=n-n3;
            *//*n=n/2;*//*
            getResult(n3 , list);
            getResult(n4 , list);
        } else {
            int n1=n/2+1;
            int n2=n/2;
            getResult(n1 , list);
            getResult(n2 , list);
        }*/
        int res=1;
        if (n % 3 == 1) {
            int cishu = (n - 4) / 3;
            for (int i = 0; i < cishu; i++) {
                res*=3;
            }
            res=res*4;
        } else if (n % 3 == 2) {
            int cishu = (n - 2) / 3;
            for (int i = 0; i < cishu; i++) {
                res*=3;

            }
            res=res*2;
        } else if (n % 3 == 0) {
            int cishu=n/3;
            for (int i = 0; i < cishu; i++) {
                res*=3;
            }
        }
        return res;
    }
}
