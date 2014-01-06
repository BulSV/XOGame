/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 02.01.14
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
public class ComputerPlayer extends Player {
    private static final String NAME = "Computer";
    private String name = NAME;

    public ComputerPlayer (Figure figure, Field field) {
        super(NAME, figure, field);
    }

    public ComputerPlayer(String name, Figure figure, Field field) {
        super(name, figure, field);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
