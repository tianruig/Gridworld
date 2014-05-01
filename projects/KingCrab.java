import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;


public class KingCrab extends CrabCritter {

    @Override
    public void processActors(ArrayList<Actor> actors) {
        Grid gr = getGrid();

        for (Actor a : actors) {
            if (!moveActorAway(a)) {
                a.removeSelfFromGrid();
            }
        }
    }

    private boolean moveActorAway(Actor actor) {
        Grid gr = getGrid();
        Location ownLocation = getLocation();

        ArrayList<Location> emptyLoc = gr.getEmptyAdjacentLocations(actor.getLocation());

        for (Location loc : emptyLoc) {
            if (distance(ownLocation, loc) > Math.sqrt(2)) {
                actor.moveTo(loc);
                return true;
            }
        }

        return false;

    }

    private double distance(Location a, Location b) {
        int ax = a.getCol();
        int ay = a.getRow();
        int bx = b.getCol();
        int by = b.getRow();

        return Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
    }
}
