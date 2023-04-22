package task;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import task.exceptions.NotEnoughSizeException;

public class DuplicateSearcher implements Searcher{
    private int[] arr;
    private Set<Integer> unique;
    private List<Integer> repeating;
    public DuplicateSearcher(int[] arr){
        this.arr = arr;
        unique = new HashSet<>();
        repeating = new LinkedList<>();
    }
    public void search(){
        int N = arr.length;
        if(N<0) throw new NotEnoughSizeException();
        for (int i=0; i<N; i++){
            int cur = arr[i];
            if(unique.contains(cur) && !repeating.contains(cur)) repeating.add(cur);
            else unique.add(cur);
        }
    }
    public List<Integer> getResult(){
        return repeating;
    }
}
