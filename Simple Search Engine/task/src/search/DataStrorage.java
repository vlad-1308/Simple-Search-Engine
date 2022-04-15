package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataStrorage {
    private List<String> dataList;

    public DataStrorage() {
        dataList = new ArrayList<>();
    }

    public DataStrorage(File file) {
        dataList = new ArrayList<>();
        try (Scanner scan = new Scanner(file)) {
            int i = 0;
            while(scan.hasNextLine()) {
                this.addPerson(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public void addPerson(String line) {
        dataList.add(line);
    }

    public List<String> getDataList() {
        return dataList;
    }
}
