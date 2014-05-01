import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
    @Override
    public ArrayList<Location> getMoveLocations() {
        ArrayList<Location> adjLoc = super.getMoveLocations();

        if (adjLoc.size() == 2) {
            Location left2 = adjLoc.get(0).getAdjacentLocation(getDirection() + Location.LEFT);
            Location right2 = adjLoc.get(1).getAdjacentLocation(getDirection() + Location.RIGHT);

            if (canMoveTo(left2) && canMoveTo(right2)) {
                adjLoc.set(0, left2);
                adjLoc.set(1, right2);

            }

        }

        return adjLoc;
    }

    private boolean canMoveTo(Location l) {
        Grid gr = getGrid();
        return (gr.isValid(l) && gr.get(l) == null);
    }
}

