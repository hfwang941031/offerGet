package company.huawei;

import java.util.Scanner;

/**
 * @ClassName CalcIPAddress
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/2 15:52
 * @Version 1.0
 */
public class CalcIPAddress {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counterA=0;
        int counterB=0;
        int counterC=0;
        int counterD=0;
        int counterE=0;
        int error=0;
        int privateIp=0;
        while (scanner.hasNext()) {

            String s = scanner.next();
            String[] ipyanma = s.split("~");
            String[] ip = ipyanma[0].split("\\.");
            String[] yanma=ipyanma[1].split("\\.");
            for (int i = 0; i < 3; i++) {
                if (Integer.parseInt(ip[i])>255){
                    error++;
                    break;
                }
                if (Integer.parseInt(yanma[i]) > 255) {
                    error++;
                }
            }
            //ip分类
            int first = Integer.parseInt(ip[0]);
            int second = Integer.parseInt(ip[1]);
            int third = Integer.parseInt(ip[2]);
            int forth = Integer.parseInt(ip[3]);
            if (first >= 0 && first <= 255 && second >= 0 && second <= 255 && third >= 0 && third <= 255 && forth >= 0 && forth <= 255) {
                if (first >= 1 && first <= 126) {
                    counterA++;
                } else if (first >= 128 && first <= 191) {
                    counterB++;
                } else if (first >= 192 && first <= 223) {
                    counterC++;
                } else if (first >= 224 && first <= 239) {
                    counterD++;
                } else if (first >= 240 && first <= 255) {
                    counterE++;
                }
                if (first == 10) {
                    privateIp++;
                }
                if (first == 172 && second <= 16 && second <= 31) {
                    privateIp++;
                }
                if (first == 192 && second == 168 && third >= 0 && third <= 255) {
                    privateIp++;
                }
            }
            System.out.print(counterA+" "+counterB+" "+counterC+" "+counterD+" "+counterE+" "+error+" "+privateIp);
        }
    }
}
