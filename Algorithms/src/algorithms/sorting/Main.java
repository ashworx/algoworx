/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

import algorithms.search.Searcher;
import algorithms.search.impl.BinarySearch;

/**
 *
 * @author ashishgrover
 */
public class Main {
    
    static Sorter s;
    
    static{
        
    }
    
    public static void main(String [ ] args)
    {
        int arr[] = {64,25,12,22,11,78,90,45,9,23,67,10,38,0,12,23,9};
        
        s.sort(arr);
        
        System.out.println("Sorted array");
        printArray(arr);
    }
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
}
