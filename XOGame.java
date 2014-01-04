package com.XOGame;

import com.XOGame.exceptions.InputNameException;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:34
 * To change this template use File | Settings | File Templates.
 */
public class XOGame {
    private Player player1;
    private Player player2;
    private Field field;

    private XOGame(Player player1, Player player2) throws InputNameException {
        if (player1.getName()/*.equalsIgnoreCase("null")*/ == null) {
            throw new InputNameException(player1.getName());
        }
        if (player2.getName()/*.equalsIgnoreCase("null")*/ == null) {
            throw new InputNameException(player2.getName());
        }
        this.player1 = player1;
        this.player2 = player2;
        field = player1.getField();
    }

    public static XOGame startNewGame(String player1, String player2, XorO xOrO) throws InputNameException{
        Field field = new ConsoleField();
        return new XOGame(new HumanPlayer(xOrO == XorO.X ? player1 : player2, new ConsoleXFigure(), field),
                new HumanPlayer(xOrO == XorO.X ? player2 : player1, new ConsoleOFigure(), field));
    }

    public static XOGame startNewGame(String player1, XorO xOrO) throws InputNameException{
        Field field = new ConsoleField();
        return new XOGame(xOrO == XorO.X ? new HumanPlayer(player1, new ConsoleXFigure(), field) :
                new ComputerPlayer(new ConsoleXFigure(), field),
                xOrO == XorO.X ? new ComputerPlayer(new ConsoleOFigure(), field) :
                        new HumanPlayer(player1, new ConsoleOFigure(), field));
    }

    public Field getField() {
        return field;
    }

    public Player getPlayer1() {

        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
