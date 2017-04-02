/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.search;

import algorithms.search.impl.BinarySearch;
import algorithms.search.impl.JumpSearch;

/**
 *
 * @author ashishgrover
 */
public class Main {
    
    static Searcher s;
    
    static{
        s = new BinarySearch();
    }
    
    public static void main(String [ ] args)
    {
        int arr[] = { 0,1, 1, 1, 2, 3, 4,5,5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 610;
        
        int index = s.search(arr, x);
        System.out.println("\nNumber " + x + " is at index " + index);
    }
    
    
}
