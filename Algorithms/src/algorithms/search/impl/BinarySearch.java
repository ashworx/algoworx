/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.search.impl;

import algorithms.search.Searcher;

/**
 *
 * @author ashishgrover
 */
public class BinarySearch implements Searcher{

    @Override
    public int search(int[] arr, int x) {
        int pos = -1;
        
        int n = arr.length;
        int start=0,end=n-1;
        int mid;
        
        while(true){
            mid = (end + start)/2;
            
            if(arr[mid] == x){
                pos = mid;
                break;
            } else if(arr[mid]<x){
                start = mid+1;
            } else {
                end = mid-1;
            }
            
        }
        
        return pos;
        
    }
    
    
    
}
