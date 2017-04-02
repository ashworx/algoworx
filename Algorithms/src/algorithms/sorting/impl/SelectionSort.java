/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.impl;

import algorithms.sorting.Sorter;

/**
 *
 * @author ashishgrover
 */
public class SelectionSort implements Sorter{

    int swaps = 0;
    int comparisons = 0;
    
    @Override
    public void sort(int[] arr) {
        int min;
        int pos = -1;
        for(int i=0;i<arr.length-1;i++){
            min = arr[i];
            for(int j=i;j<arr.length;j++){
                comparisons++;
                if(arr[j]<min){
                    min = arr[j];
                    pos = j;
                }
            }
            swaps++;
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        
        System.out.println("No. of comparisons : " + comparisons);
        System.out.println("No. of swaps : " + swaps);
    }
    
    
    
}
