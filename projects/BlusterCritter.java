import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;


public class BlusterCritter extends Critter {
    private int courage;

    public BlusterCritter(int c) {
        super();
        courage = c;
    }

    // A BlusterCritter looks at all of the neighbors within two steps of its current location.
    @Override
    public ArrayList<Actor> getActors() {
        ArrayList<Actor> actors = new ArrayList(24);
        Grid<Actor> gr = getGrid();

        Location currLoc = getLocation();

        for (int r = -2; r <= 2; r++) {
            for (int c = -2; c <= 2; c++) {
                Location checkLoc = new Location(currLoc.getRow() + r, currLoc.getCol() + c);

                if (gr.isValid(checkLoc)){
                    Actor a = gr.get(checkLoc);

                     if (a != null && a != this){
                        actors.add(gr.get(checkLoc));
                    }
                }
            }
        }


        return actors;
    }

    @Override
    public void processActors(ArrayList<Actor> a){
        int n = 0;
        for (Actor actor : a) {
            if (actor instanceof Critter) {
                n++;
            }
        }

        if (n < courage) {
            setColor(getColor().brighter());
        } else {
            setColor(getColor().darker());
        }
    }
}
