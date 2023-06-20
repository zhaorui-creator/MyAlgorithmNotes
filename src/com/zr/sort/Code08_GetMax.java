package com.zr.sort;

/**
 * @author zhaorui
 * @version 1.0
 */
public class Code08_GetMax {
    public static int getMax(int[] arr){
        if(arr==null||arr.length==0){
            //
            return -1;
        }
        return process(arr,0,arr.length-1);
    }
    //arr[L..R]范围求最大值
    public static int process(int[] arr,int L,int R){
        if(L==R){ //arr[L...R]上只有一个数  直接返回  base case
            return arr[L];
        }
        //mid=(L+R)/2
        //mid=L+(R-L)/2

        int mid=L+((R-L)>>1); //中点
        int leftMax=process(arr,L,mid);
        int rightMax=process(arr,mid,R);
        return Math.max(leftMax,rightMax);
    }
}

//master公式
