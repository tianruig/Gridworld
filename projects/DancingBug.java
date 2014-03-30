import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int[] moves;
    private int m;

    public DancingBug(int[] a) {
        moves = a;
        m = 0;
    }

    public void danceTurn() {
        setDirection(getDirection() + (moves[m %= moves.length] * 45));
        m++;
    }

    @Override
    public void act() {
        danceTurn();
        super.act();
    }
}
