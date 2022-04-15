package search;

import java.util.*;
import java.util.stream.Collectors;

public class Marker {
    private final Map<String, List<Integer>> dataMap;
    private final List<String> dataList;

    public Marker(List<String> data) {
        this.dataMap = indexingData(data);
        this.dataList = data;
    }

    private Map<String, List<Integer>> indexingData(List<String> data) {
        Map<String, List<Integer>> dataMap = new HashMap<>();
        String[] str;
        int index = 0;
        Iterator<String> iter = data.iterator();
        while (iter.hasNext()) {

            str = iter.next().split(" ");
            for (int i = 0; i < str.length; i++) {
                String keyWord = str[i].toLowerCase();
                if (!dataMap.containsKey(keyWord)) {
                    List<Integer> indexList = new ArrayList<>();
                    indexList.add(index);
                    dataMap.put(keyWord, indexList);
                } else {
                    dataMap.get(keyWord).add(index);
                }
            }
            index++;
        }
        return dataMap;
    }

    public Map<String, List<Integer>> getDataMap() {
        return dataMap;
    }

    public List<String> getDataList() {
        return dataList;
    }
}
