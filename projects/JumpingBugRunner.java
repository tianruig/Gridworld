
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;

public class JumpingBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
        JumpingBug alice = new JumpingBug(Color.ORANGE);
        world.add(new Location(0, 0), alice);
        world.show();
    }
}