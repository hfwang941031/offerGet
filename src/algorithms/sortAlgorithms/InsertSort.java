package algorithms.sortAlgorithms;

/*

 *@author havel 2019/3/12 19:52

 */
public class InsertSort {
    public static void main(String[] args){
        int[] array = {9, 5, 2, 1, 6, 7, 3, 4, 0,5, 10};
        sort(array);
        SortUtils.show(array);

    }

    public static void sort(int[] array) {
        if (array.length != 0 || array != null) {

            for (int i = 0; i < array.length-1; i++) {
                for (int j = i; j >0; j--) {
                    if (array[j] <= array[j-1]) {
                        int min=array[j];
                        array[j] = array[j - 1];
                        array[j-1]=min;
                    }
                }
            }

        }
    }
}
