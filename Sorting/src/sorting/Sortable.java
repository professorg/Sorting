/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Date;
import java.util.List;

/**
 *
 * @author gvandomelen19
 */
public class Sortable {

    public static final int LEAST_TO_GREATEST = 0;

    public static final int BUBBLE_SORT = 0;

    public List<Comparable> data;

    public Sortable(List<Comparable> c) {

        this.data = c;
    }

    public void sort(int algorithm, int mode) {

        switch (algorithm) {

            case BUBBLE_SORT:

                data = bubbleSort(data, mode);
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

    public List<Comparable> bubbleSort(List<Comparable> data, int mode) {
        
        switch (mode) {
            
            case LEAST_TO_GREATEST:
                
                for (int i = 0; i < data.size(); i++) {

                    for (int j = 0; j < data.size() - i - 1; j++) {
                        
                        long now = new Date().getTime();
                        while(new Date().getTime() < now + 1){}

                        if (data.get(j).compareTo(data.get(j + 1)) > 0) {

                            swap(j, j + 1);
                        }
                    }
                }
                break;
        }
        return data;
    }

}
