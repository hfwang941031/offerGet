package company.huawei;

/**
 * @ClassName Main5
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/3 21:28
 * @Version 1.0
 */
import java.util.Scanner;
import java.util.ArrayList;

class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String readNumberStr = input.nextLine();
        int outCountPre = 0;
        try {
            outCountPre = Integer.parseInt(readNumberStr);
        } catch(Exception e) {}
        int arrayNumber = 0;
        int count = 0;
        ArrayList numberList = new ArrayList();
        String temp;
        while((!(temp = input.nextLine()).equals(""))) {
            arrayNumber++;
            temp = input.nextLine();
            String[] arr = temp.split(",");
            numberList.add(arr);
            count += arr.length;
        }
        int currentPregress = 0;
        int outCount = 0;

        while(outCount < count) {
            for(int i = 0; i < arrayNumber; i++) {
                String[] arr = (String[]) numberList.get(i);
                for (int j = currentPregress, g = 0; g < outCountPre && j < arr.length; j++, g++) {
                    //System.out.println(i+","+j+","+g);
                    System.out.print(arr[j]);
                    outCount++;
                    if (outCount != count) {
                        System.out.print(",");
                    }
                }
            }
            currentPregress+=outCountPre;
        }
        System.out.println("");
    }
}
