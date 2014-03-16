import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    private int steps;
    private int length;

    public ZBug(int l) {
        length = l;
        steps = 0;
        super.setDirection(90);
    }

    @Override
    public void act() {
        if (canMove() && steps < 3 * length){
            if (steps == length) {
                super.setDirection(225);
            } else if (steps == 2 * length) {
                super.setDirection(90);
            }
            move();
            steps++;
        }
    }
}
