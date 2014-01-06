/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:38
 * To change this template use File | Settings | File Templates.
 */
public class Coordinate {
    private static final int I = 0;
    private static final int J = 0;
    private int i = I;
    private int j = J;

    public Coordinate() {
//        this(I, J);
    }

    public void setI (int i) {
        this.i = i;
    }

    public void setJ (int j) {
        this.j = j;
    }

    public int getI () {
        return i;
    }

    public int getJ () {
        return j;
    }

    public Coordinate (int i, int j) {
        this.i = i;
        this.j = j;
    }
}
