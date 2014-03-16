import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;

public class ZBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
        ZBug alice = new ZBug(2);
        alice.setColor(Color.ORANGE);
        ZBug bob = new ZBug(3);
        world.add(new Location(10, 10), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
    
}
