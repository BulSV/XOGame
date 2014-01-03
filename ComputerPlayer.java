package com.XOGame;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 02.01.14
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
public class ComputerPlayer extends Player {
    private static final String NAME = "Computer";

    public ComputerPlayer (Figure figure, Field field) {
        super(NAME, figure, field);
    }
}
