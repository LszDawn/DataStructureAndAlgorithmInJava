package com.lsz.java.Sort;

import static com.lsz.java.Example.exch;
import static com.lsz.java.Example.less;

public class Selection {
    public static void sort(Comparable[] a){
        //将a[]按升序排列
        int N = a.length; //数组长度
        for (int i = 0;i < N; i++){
            int min = i;
            for (int j = i+1; j < N; j++){
                if (less(a[j], a[min])){
                    min =j;
                    exch(a, i, min);
                }
            }
        }

    }
}
