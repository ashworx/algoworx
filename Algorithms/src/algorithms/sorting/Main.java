/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

import algorithms.sorting.impl.BubbleSort;
import algorithms.sorting.impl.SelectionSort;

/**
 *
 * @author ashishgrover
 */
public class Main {
    
    static Sorter s;
    
    static{
        s = new SelectionSort();
    }
    
    public static void main(String [ ] args)
    {
        int arr[] = {64,25,12,22,11,34,56,89,12,0,23,12,49};
        
        long start = System.nanoTime();
        s.sort(arr);
        long end = System.nanoTime();
        
        System.out.println("Sorted array");
        printArray(arr);
        
        System.out.println("Time to process: " + (end-start)/1000 + " micro sec");
        System.out.println("No. of comparisons : " + s.getSwaps());
        System.out.println("No. of swaps : " + s.getComps());
    }
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
}
