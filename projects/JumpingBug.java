import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;

public class JumpingBug extends Bug {
    public JumpingBug(Color color) {
        super(color);
    }

    @Override
    public boolean canMove() {
        Grid<Actor> gr = getGrid();

        if (gr == null) {
            return false;
        }

        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location nextNext = next.getAdjacentLocation(getDirection());

        if (gr.isValid(next)) {
            Actor a = gr.get(next);
            return (a == null || a instanceof Flower);
        } else if (gr.isValid(nextNext)) {
            Actor a = gr.get(nextNext);
            return (a == null || a instanceof Flower);
        }
        return false;
    }

    @Override
    public void move() {
        Grid<Actor> gr = getGrid();

        if (gr == null) {
            return;
        }

        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location nextNext = next.getAdjacentLocation(getDirection());

        if (gr.isValid(nextNext)) {
            Actor a = gr.get(nextNext);
            if (a == null || a instanceof Flower) {
                moveTo(nextNext);
                return;
            }
        }

        if (gr.isValid(next)) {
            Actor a = gr.get(next);
            if (a == null || a instanceof Flower) {
                moveTo(next);
            }
        }
    }
}
