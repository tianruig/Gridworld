import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class KingCrabRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 4), new KingCrab());
        world.show();
    }
}
