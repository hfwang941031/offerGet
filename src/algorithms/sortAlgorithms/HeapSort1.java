package algorithms.sortAlgorithms;

/**
 * @ClassName HeapSort1
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/3/25 10:34
 * @Version 1.0
 */
public class HeapSort1 {
    public static void main(String[] args){
        int[] array = {9, 5, 2, 1, 6, 7,8,3,4,10};
        sort(array);
        SortUtils.show(array);

    }

    public static void sort(int[] array) {
        //1.构建大顶堆
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子节点 从下至上  从右至左调整结构
            adjustHeap(array, i, array.length);
        }
        //2.交换堆顶元素与末尾元素
        for (int j = array.length - 1; j > 0; j--) {
            swap(array, 0, j);//将堆顶元素与末尾元素进行交换
            adjustHeap(array, 0, j);//重新调整堆
        }
    }

    public static void adjustHeap(int[] array, int i, int length) {
        int temp = array[i];//先取出当前元素
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子节点开始，也就是2i+1处开始
            if (k + 1 < length && array[k] < array[k + 1]) {//如果左子节点小于右子节点，k指向右子节点
                k++;
            }
            if (array[k] > temp) {//如果子节点大于父节点，将子节点的值赋给父节点(不用进行交换)
                array[i] = array[k];
                i = k;
            } else {
                break;
            }

            array[i]=temp;//将temp值放到最终的位置
        }

    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b]=temp;
    }
}
