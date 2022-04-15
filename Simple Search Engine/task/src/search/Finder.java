package search;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Finder {

    public Finder() {

    }

    public abstract Collection<Integer> getIndex(Map<String, List<Integer>> map, String keyWord);

    public List<String> findByKey(List<String> dataList, String keyWord) {
        return dataList.stream().filter(lines -> lines.toLowerCase().contains(keyWord))
                .collect(Collectors.toList());
    }
}
