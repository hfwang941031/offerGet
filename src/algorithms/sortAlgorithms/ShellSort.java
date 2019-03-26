package algorithms.sortAlgorithms;

/*

 *@author havel 2019/3/21 14:02

 */
public class ShellSort {
    public static void main(String[] args){
        int[] array = {9, 5, 2, 1, 6, 7,8,3,4,10};
        sort(array);
        SortUtils.show(array);

    }
    public static  void sort(int[] array) {
        if (array == null && array.length == 0) {
            return ;
        }
        int incrementNum=array.length/2;//设置初始增量
        while (incrementNum >= 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length - incrementNum; j += incrementNum) {
                    if (array[j] < array[i]) {
                        int temp=array[j];
                        array[j]=array[i];
                        array[i]=temp;
                    }
                }
            }
            //设置新的增量
            incrementNum=incrementNum/2;
        }
    }
}
