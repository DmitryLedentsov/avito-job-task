import java.util.List;

import task.*;

public class Main{
    public static void main(String[] args) {
        int arr[] = {1,1, 2,3,4,5,5,5,6};
        Searcher searcher = new DuplicateSearcher(arr);
        searcher.search();
        List<Integer> result = searcher.getResult();
        for(Integer i: result) System.out.println(i);
    }
}