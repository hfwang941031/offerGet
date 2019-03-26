package algorithms.sortAlgorithms;

/*

 *@author havel 2019/3/21 12:52

 */
public class BubbleSort {
    public static void main(String[] args){
        int[] array = {9, 5, 2, 1, 6, 7};
        sort(array);
        SortUtils.show(array);


    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1 ; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }


}
