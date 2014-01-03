package com.XOGame;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 02.01.14
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
public abstract class Player {
    private String name;
    private Figure figure;
    private Field field;

    public Player (String name, Figure figure, Field field) {
        this.name = name;
        this.figure = figure;
        this.field = field;
    }

    public String getName () {
        return  name;
    }

    public Figure getFigure() {
        return figure;
    }

    public Field getField() {
        return field;
    }
    public void move (Coordinate stroke) {
        getField().setFigure(stroke, getFigure());;
    }
}
