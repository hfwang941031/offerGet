package algorithms.sortAlgorithms;

/*

 *@author havel 2019/3/21 14:44

 */
public class QuickSort {
    public static void main(String[] args){
        int[] array = {9, 5, 2, 1, 6, 7,8,3,4,10};
        sort(array,0,array.length-1);
        SortUtils.show(array);

    }

    public static void sort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        int i,j,temp,t;
        i=left;
        j=right;
        //temp为基准位
        temp = array[left];
        while (i < j) {
            //先看右边依次往左递减
            while (temp <= array[j] && i < j) {
                j--;
            }
            //再看左边 依次往右递增
            while (temp >= array[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        //最后将基准位置与i和j想等位置的数字交换
        array[left] = array[i];
        array[i]=temp;
        //递归调用左半数组
        //这里的j其实经过上面的j不断左移，已经到达了切分的位置
        sort(array, left, j - 1);
        sort(array,j+1,right);
    }
}
