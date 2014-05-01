import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Created by tianrui on 4/2/14.
 */
public class Tester {
    public static void main(String[] args) {
        BoundedGrid bg = new BoundedGrid(10, 10);
        Location l = new Location(1, 1);

        String s = "a";

        bg.put(l, s);
    }
}
