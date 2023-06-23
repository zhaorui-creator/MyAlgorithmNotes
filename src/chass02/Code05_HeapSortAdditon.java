package chass02;

/**
 * @author zhaorui
 * @version 1.0
 */

/**
 * 堆排序扩展题目
 * 已知一个几乎有序的数组，几乎有序是指，如果把数据排好序的话，每个元素移动的距离可以不超过k,并且k相对于数组来说比较小。
 * 请选择一个合适的排序算法针对这个数组进行排序
 */

//思路 ：假设k为7，将原始数组的前8个数放入小根堆，由于移动距离不超过k,小根堆弹出一个数必然是最小的，弹出的同时将数组的第九个数放入小根堆  周而复始
public class Code05_HeapSortAdditon {
}
