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
public class SelectionSort extends Sorter{
    
    @Override
    public void sort(int[] arr) {
        int min;
        int pos = -1;
        for(int i=0;i<arr.length-1;i++){
            min = arr[i];
            for(int j=i;j<arr.length;j++){
                comps++;
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
        
        
    }
   
    
}
