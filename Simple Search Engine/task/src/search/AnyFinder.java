package search;

import java.util.*;

public class AnyFinder extends Finder {

    public AnyFinder() {
        super();
    }

    @Override
    public Collection<Integer> getIndex(Map<String, List<Integer>> map, String keyWord) {
        String[] keyWords = keyWord.split(" ");
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < keyWords.length; i++) {
            result.addAll(map.getOrDefault(keyWords[i], null));
        }

        return result;
    }

}
