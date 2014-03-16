
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;

public class SpiralBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
        SpiralBug alice = new SpiralBug(2);
        alice.setColor(Color.ORANGE);
//        SpiralBug bob = new SpiralBug(3);
        world.add(new Location(0, 0), alice);
//        world.add(new Location(5, 5), bob);
        world.show();
    }
}