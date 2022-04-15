package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllFinder extends Finder{

    public AllFinder() {
        super();
    }

    @Override
    public List<Integer> getIndex(Map<String, List<Integer>> map, String keyWord) {
        String[] keyWords = keyWord.split(" ");
        List<Integer>[] lists = new ArrayList[keyWords.length];
        List<Integer> result;
        for (int i = 0; i < keyWords.length; i++) {
            lists[i] = map.getOrDefault(keyWords[i], null);
        }
        result = lists[0];
        for (int i = 1; i < lists.length; i ++) {
            if (lists[i] != null) {
                result.retainAll(lists[i]);
            }
        }
        return result;
    }
}
