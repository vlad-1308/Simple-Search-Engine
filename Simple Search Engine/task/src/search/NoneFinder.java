package search;

import java.util.*;

public class NoneFinder extends Finder{

    public NoneFinder() {
        super();
    }

    @Override
    public Collection<Integer> getIndex(Map<String, List<Integer>> map, String keyWord) {
        String[] keyWords = keyWord.split(" ");
        List<Integer>[] lists = new ArrayList[keyWords.length];
        Set<Integer> result = new HashSet<>();
        Iterator<List<Integer>> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            result.addAll(iterator.next());
        }
        for (int i = 0; i < keyWords.length; i++) {
            result.removeAll(map.getOrDefault(keyWords[i], null));
        }

        return result;
    }

}
