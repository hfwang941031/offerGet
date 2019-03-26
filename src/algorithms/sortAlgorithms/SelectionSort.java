package algorithms.sortAlgorithms;

/*

 *@author havel 2019/3/12 19:15

 */
public class SelectionSort {
    public static void main(String[] args){
        int[] array = {9, 5, 2, 1, 6, 7, 3, 4, 0,5, 10};
        sort(array);
        SortUtils.show(array);



    }
    public static void sort(int[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] >= array[j]) {
                        int min = array[j];
                        array[j]=array[i];
                        array[i]=min;
                    }
                }
            }
        }
    }
}
