package edu.cmu.cs.cs214.rec04;

//import java.util.Comparator;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

/**
 * 
 * 
 * 
 *  
 * */ 
public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList sortList = new SortedIntList();
    private int total = 0;
    
    public int getTotalAdded() {
        return total;
    }

    @Override
    public boolean add(int num) {
        boolean res = sortList.add(num);
        if (res) {
            total++;
        }
        return res;
    }

   @Override
    public boolean addAll(IntegerList list) {
        boolean res = sortList.addAll(list);
        if (res) {
            total += list.size();
        }
        return res;
    }  
    
    @Override
    public int get(int index) {
        return sortList.get(index);
    }

    @Override
    public boolean remove(int num){
        return sortList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortList.removeAll(list);
    }

    @Override
    public int size() {
        return sortList.size();
    }

}