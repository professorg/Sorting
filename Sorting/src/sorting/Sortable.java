/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.List;

/**
 *
 * @author gvandomelen19
 */
public class Sortable {
    
    public static final int LEAST_TO_GREATEST = 0;
    public static final int GREATEST_TO_LEAST = 1;
    
    public static final int BUBBLE_SORT = 0;
    
    public List<Comparable> data;
    
    public Sortable(List<Comparable> c) {
        
        this.data=c;
    }
    
    public void sort(int algorithm, int mode) {
        
        switch(algorithm) {
            
            case BUBBLE_SORT:
                
                data = bubbleSort(data);
                break;
            
            default:
                throw new IllegalArgumentException("Algorithm not found");
        }
    }
    
    private void swap(int index1, int index2) {
        
        Comparable buffer = data.get(index1);
        data.set(index1, data.get(index2));
        data.set(index2, buffer);
    }
    
    public List<Comparable> bubbleSort(List<Comparable> data) {
        
        return data;
    }
    
}
