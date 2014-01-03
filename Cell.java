package com.XOGame;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:38
 * To change this template use File | Settings | File Templates.
 */
public class Cell {
    private Figure figure;
    private final Coordinate pos;

    public Cell(Coordinate pos) {
        this.pos = pos;
    }

    public void setFigure(Figure figure) {
//        System.out.println("Cell.setFigure: " + figure);
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }

    public Coordinate getPos() {
        return pos;
    }

    public void reDraw() {
        figure.draw();
    }
}
