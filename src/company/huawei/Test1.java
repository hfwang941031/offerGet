package company.huawei;



import java.util.Scanner;

/**
 * @ClassName Main3
 * @Description TODO
 * @Author 王海峰
 * @Version 1.0
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String readNumberStr = input.nextLine();
        int outCountPre = 0;
        try {
            Integer.parseInt(readNumberStr);
        } catch(Exception e) {}
        int arrayNumber = 0;
        int count = 0;
        ArrayList numberList = new ArrayList();
        while(input.hasNextLine()) {
            arrayNumber++;
            String temp = input.nextLine();
            String[] arr = temp.split(",");
            numberList.add(arr);
            count += arr.length;
        }
        int currentPregress = 0;
        int outCount = 0;
        for(int i = 0; i < arrayNumber; i++) {
            String[] arr = (String[]) numberList.get(i);
            for (int j = currentPregress, g = 0; g < outCountPre && j < arr.length; j++, g++) {
                System.out.print(arr[j]);
                outCount++;
                if (outCount != count-1) {
                    System.out.print(",");
                } else {
                    System.out.println("");
                }
            }
        }
    }
}

