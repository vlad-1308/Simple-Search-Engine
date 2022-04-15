package search;

import java.util.*;

public class Menu {
    private static final StringBuilder menuItems = new StringBuilder().append("=== Menu ===\n")
            .append("1. Find a person\n")
            .append("2. Print all people\n")
            .append("0. Exit");


    public static void showMenu() {
        System.out.println(menuItems);
    }

    public static void checkItem(DataStrorage data, Marker marker) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine().trim();
        if (item.equals("1")) {
            Menu.findAndPrintPerson(data, marker);
            System.out.println("\n");
        } else if (item.equals("2")) {
            Menu.printAllData(data);
            System.out.println("\n");
        } else if (item.equals("0")) {
            Menu.closeProgramm();
        } else {
            System.out.println("Incorrect option! Try again.\n");
        }


    }

    public static void printAllData(DataStrorage data) {
        System.out.println("=== List of people ===");
        Iterator<String> iterator = data.getDataList().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void findAndPrintPerson(DataStrorage data, Marker marker) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a matching strategy: ALL, ANY, NONE");
        FinderVoter finderVoter;
        while (true) {
            String strategy = scan.nextLine();
            finderVoter = new FinderVoter(strategy);
            if (finderVoter.choisMade) {
                break;
            } else {
                System.out.println("Invalid matching strategy. Please, choose from : ALL, ANY, NONE");
            }
        }
        System.out.println("Enter a name or email to search all suitable people.");
        String keyWord = scan.nextLine().toLowerCase().trim();
        Finder finder = finderVoter.getFinder();
        if (finder.getIndex(marker.getDataMap(), keyWord) == null || finder.getIndex(marker.getDataMap(), keyWord).isEmpty()) {
            System.out.println("No matching people found.");
        } else {
            System.out.println(finder.getIndex(marker.getDataMap(), keyWord).size() + " persons found:");
            finder.getIndex(marker.getDataMap(), keyWord).stream().map(integer -> data.getDataList().get(integer))
                    .forEach(System.out::println);
        }
    }

    public static void closeProgramm() {
        System.out.println("Bye!");
        System.exit(0);
    }
}
