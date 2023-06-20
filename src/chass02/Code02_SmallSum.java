package chass02;

/**
 * @author zhaorui
 * @version 1.0
 * <p>
 * 小和问题
 * 在一个数组中,每一个数左边比他小的数累加起来，叫做这个数组的小和
 * <p>
 * 小和问题
 * 在一个数组中,每一个数左边比他小的数累加起来，叫做这个数组的小和
 */

/**
 * 小和问题
 * 在一个数组中,每一个数左边比他小的数累加起来，叫做这个数组的小和
 */

/**
 * 解题思路
 * 相当于对于每个数来说,左边有几个数比它大，他就被算进多少次小和,归并排序的过程就可以产生小和
 * 注意点：遇到相等的数，先拷贝右组的数 主要是为了让左组的数知道右边有多少个数比它大
 * 相等的情况下 先拷贝右组的数 意味着不认为相等情况下 右组的数比左组大
 */

public class Code02_SmallSum {

    public static void main(String[] args){

    }
    public static int smallSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        return process(arr, 0, arr.length - 1);
    }

    //arr[L..R]既要排好序  也要返回小和
    public static int process(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        int mid = L + ((R - L) >> 1);
        return process(arr, L, mid)
                + process(arr, mid, R)
                + merge(arr, L, mid, R);

    }

    public static int merge(int[] arr,int L,int M,int R){
        int[] help = new int[R-L+1];
        int i=0;
        int p1=L;
        int p2=M+1;
        int res=0;
        while(p1<=M&&p2<=R){
            res+=arr[p1]<arr[p2]?(R-p2+1)*arr[p1]:0;
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }

        while(p1<=M){
            help[i++]=arr[p1++];
        }
        while(p2<=R){
            help[i++]=arr[p2++];
        }

        for(i=0;i<arr.length;i++){
            arr[L+i]=help[i++];
        }

        return res;
    }
}
