package com.lsz.java;

public class Example {
    public static void sort(Comparable[] a){
        /*见算法2.1，2.2，2.3，2.4，2.5，2.7*/
    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        //单行打印数组
        for (int i = 0; i < a.length; i++){
            StdOut.print(a[i] + " ");
            StdOut.println();
        }
    }

    public static boolean isSorted(Comparable[] a){
        //判断数组元素是否有序
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //读取字符串并排序输出
        String[] a = new String[]{"a","f","e"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
