package algorithms.sortAlgorithms;

/*

 *@author havel 2019/3/21 13:31

 */
public class MergeSort {
    public static void main(String[] args){
        int[] array = {9, 5, 2, 1, 6, 7,8,3,4,10};
        sort(array,0,array.length-1);
        SortUtils.show(array);

    }
    public static void sort(int[] array,int left,int right) {
        if (right<=left)
            return;
        int mid=left+(right-left)/2;
        sort(array,left,mid);
        sort(array,mid+1,right);
        merge(array,left,mid,right);
    }
    public static void merge(int[] array,int left,int mid,int right) {
        int i=left;
        int j=mid+1;
        int[] aux = new int[array.length];
        for (int k = left; k <= right; k++) {
            aux[k] = array[k];
        }
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > right) {
                array[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                array[k] = aux[j++];

            } else {
                array[k] = aux[i++];
            }

        }
    }
}
