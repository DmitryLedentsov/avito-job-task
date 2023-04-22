package task;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import task.exceptions.LimitExceedException;

public class DuplicateSearcher implements Searcher{
    private int[] arr;

    public DuplicateSearcher(int[] arr){
        this.arr = arr;
    }
    public List<Integer> search(){
        Set<Integer> unique = new HashSet<>();
        List<Integer> repeating=  new LinkedList<>();
        int N = arr.length-2;
        for (int i=0; i<arr.length; i++){
            int cur = arr[i];
            if(cur>N) throw new LimitExceedException();
            if(unique.contains(cur) && !repeating.contains(cur)) repeating.add(cur);
            else unique.add(cur);
        }
        return repeating;
    }
}
