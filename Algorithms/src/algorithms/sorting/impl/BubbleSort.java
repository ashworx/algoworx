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
public class BubbleSort extends Sorter{

    @Override
    public void sort(int[] arr) {
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                comps++;
                if(arr[j]>arr[j+1]){
                    swaps++;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    
}
