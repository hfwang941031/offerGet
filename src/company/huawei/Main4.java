package company.huawei;

import java.util.Arrays;

/**
 * @ClassName Main4
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/4/3 21:16
 * @Version 1.0
 */
public class Main4 {
    private void  getArr(){
        int[][] arr = new int[][]{{2,5,6,7,9,5,7},{1,7,4,3,4}};
        //其次我们依次遍历二维数组中的一维数组元素
        //遍历第一个一维数组
        System.out.println("普通输出：");
        for(int i=0;i<arr[0].length;i++){
            System.out.print(arr[0][i]+" ");
        }
        System.out.println();//每执行完一个一维数组换行
        //遍历第二个一维数组
        for(int i=0;i<arr[1].length;i++){
            System.out.print(arr[1][i]+" ");
        }
        System.out.println();//每执行完一个一维数组换行
        System.out.println("改进后：");
        //上面三式子可视代码相似，所以我们对其进行改进化简
        //取3个
        int outArrLength = 0;
        for(int a=0;a<arr.length;a++){
            for(int i=0;i<arr[a].length;i++){
                outArrLength ++;
            }
        }
        //获取总长度
        System.out.println("长度："+outArrLength);
        int outArr[] = new int[0];
        int getNum = 3;


        for(int i=0;i<outArr.length;i++){
            System.out.print(outArr[i]+",");
        }
        for (int i = 0;outArrLength > outArr.length;i++){
            outArr =  this.loopArr(arr,i,3);
        }
        for(int i=0;i<outArr.length;i++){
            System.out.print(outArr[i]+",");
        }
    }
    /**
     * @Author: Created by DaiShukun on 2019/4/3.
     * @MethodName:
     * @描述: describe
     */
    private int[] loopArr(int[][] arr,int fre,int getNum){
        //第几次循环:fre

        int outArr[] = new int[0];
        for(int a=0;a<arr.length;a++){//控制每个一维数组
            for(int i=fre*getNum;i<arr[a].length;i++){//控制每个一维数组中的元素
                if (i<(fre+1)*getNum){
                    //输出每个元素的值
                    outArr = Arrays.copyOf(outArr, outArr.length+1);
                    outArr[outArr.length-1]=arr[a][i];
                    //System.out.println(outArr);
                }
                continue;
            }
            //System.out.println(a);//每执行完一个一维数组换行
        }
        for(int i=0;i<outArr.length;i++){
            System.out.print(outArr[i]+",");
        }
        return outArr;
    }
}
