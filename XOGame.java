package com.XOGame;

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

    private XOGame(Player player1, Player player2) throws InputNameException{
        if (player1 == null || player2 == null) {
            throw new InputNameException("Значение имени null");
        }
        this.player1 = player1;
        this.player2 = player2;
        field = player1.getField();
    }

    public static XOGame startNewGame(String player1, String player2) throws InputNameException{
        Field field = new ConsoleField();
        return new XOGame(new HumanPlayer(player1, new ConsoleXFigure(), field),
                new HumanPlayer(player2, new ConsoleOFigure(), field));
    }

    public static XOGame startNewGame(String player1) throws InputNameException{
        Field field = new ConsoleField();
        return new XOGame(new HumanPlayer(player1, new ConsoleXFigure(), field),
                new ComputerPlayer(new ConsoleOFigure(), field));
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
