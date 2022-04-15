package search;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        final String PATH_TO_FILE = ".\\Simple\u0020Search\u0020Engine\\task\\src\\search\\";
        String fileName = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].contains("data")) {
                fileName = args[++i];
                break;
            }
        }
        File file = new File(fileName);
        DataStrorage data = new DataStrorage(file);
        Marker marker = new Marker(data.getDataList());
        while (true) {
            Menu.showMenu();
            Menu.checkItem(data, marker);
        }
    }
}


