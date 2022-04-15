package search;

public class FinderVoter {
    private Finder finder;
    boolean choisMade = false;

    public FinderVoter(String stategy) {
        switch (stategy.toLowerCase()) {
            case ("any") :
                finder = new AnyFinder();
                choisMade = true;
                break;
            case ("all") :
                finder = new AllFinder();
                choisMade = true;
                break;
            case ("none") :
                finder = new NoneFinder();
                choisMade = true;
                break;
        }
    }

    public Finder getFinder() {
        return finder;
    }

}
