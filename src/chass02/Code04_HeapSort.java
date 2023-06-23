package chass02;

/**
 * @author zhaorui
 * @version 1.0
 */
public class Code04_HeapSort {
    public static void main(String[] args) {


    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) { //O(N)
            heapInsert(arr, i);  //O(logN)
        }

        //另外一种将整棵树调整为大根堆的方法 O(N)复杂度
        for (int i = arr.length - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }

        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {//O(N)
            heapify(arr, 0, heapSize); //O(logN)
            swap(arr, 0, --heapSize);
        }
    }

    //arr[0..index-1]已经是大根堆了 某个数现在处在index 往上继续移动
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;

        }

    }

    //某个数在index位置，看看能否往下沉，能否往下移动
    //不断和左右两个孩子比较
    //较大的孩子如果大于当前的父，父节点往下沉，较大孩子上来，然后周而复始
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1; //左孩子的下标
        while (left < heapSize) { //下方还有孩子的时候
            //两个孩子中，谁的值大，把下标给largest
            int largest =
                    left + 1 < heapSize && arr[left + 1] > arr[left]
                            ? left + 1
                            : left;
            //父和较大的孩子之间，谁的值大，把下标给largest
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
