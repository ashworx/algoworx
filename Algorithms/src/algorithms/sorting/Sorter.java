/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

/**
 *
 * @author ashishgrover
 */
public abstract class Sorter {
    
    public int swaps;
    public int comps;
    
    public abstract void sort(int[] arr);
    
    public int getSwaps(){
        return swaps;
    }
    
    public int getComps(){
        return comps;
    }
    
}
