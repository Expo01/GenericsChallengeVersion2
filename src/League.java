import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league); //collections class automatically uses the overridden Comparable compareTo method we
        // created
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}