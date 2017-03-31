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
public class JumpSearch  implements Searcher{

    @Override
    public int search(int[] arr, int x) {
        int pos = -1;
        
        int p = 0;
        int n = arr.length;
        int jump = Math.sqrt(n)==0?1:(int)(Math.sqrt(n));
        
        
        while(true){
            if(p+jump>=n || arr[p+jump]>=x ){
                break;
            }
            else {
                p= p+jump;
            }
        }
        
        for(int i=0;i<=jump && p+i<n;i++){
            if(arr[p+i]==x){
                pos = p+i;
                break;
            }
        }
        
        
        return pos;
    }

}
