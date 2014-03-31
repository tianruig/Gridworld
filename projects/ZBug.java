import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug {
    private int steps;
    private int length;

    public ZBug(int l) {
        length = l;
        steps = 0;
        setDirection(Location.EAST);
    }

    @Override
    public void act() {
        if (canMove() && steps < 3 * length){
            if (steps == length) {
                setDirection(Location.SOUTHWEST);
            } else if (steps == 2 * length) {
                setDirection(Location.EAST);
            }
            move();
            steps++;
        }
    }
}
